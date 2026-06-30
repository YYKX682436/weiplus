package z2;

/* loaded from: classes13.dex */
public class k0 {
    public long A;
    public final boolean C;
    public final android.app.Notification D;
    public boolean E;
    public final java.util.ArrayList F;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f550990a;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.CharSequence f550994e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.CharSequence f550995f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.PendingIntent f550996g;

    /* renamed from: h, reason: collision with root package name */
    public android.app.PendingIntent f550997h;

    /* renamed from: i, reason: collision with root package name */
    public p012xc85e97e9.p075x2eaf9f.p077x600aa8b.p078xcebc809e.C1090x3d9c397b f550998i;

    /* renamed from: j, reason: collision with root package name */
    public int f550999j;

    /* renamed from: l, reason: collision with root package name */
    public z2.s0 f551001l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.CharSequence f551002m;

    /* renamed from: n, reason: collision with root package name */
    public int f551003n;

    /* renamed from: o, reason: collision with root package name */
    public int f551004o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f551005p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f551006q;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f551008s;

    /* renamed from: t, reason: collision with root package name */
    public android.os.Bundle f551009t;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.RemoteViews f551012w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.RemoteViews f551013x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.RemoteViews f551014y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f551015z;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f550991b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f550992c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f550993d = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f551000k = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f551007r = false;

    /* renamed from: u, reason: collision with root package name */
    public int f551010u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f551011v = 0;
    public int B = 0;

    public k0(android.content.Context context, java.lang.String str) {
        android.app.Notification notification = new android.app.Notification();
        this.D = notification;
        this.f550990a = context;
        this.f551015z = str;
        notification.when = java.lang.System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f550999j = 0;
        this.F = new java.util.ArrayList();
        this.C = true;
    }

    public static java.lang.CharSequence c(java.lang.CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public z2.k0 a(z2.f0 f0Var) {
        if (f0Var != null) {
            this.f550991b.add(f0Var);
        }
        return this;
    }

    public android.app.Notification b() {
        android.app.Notification notification;
        android.os.Bundle bundle;
        android.widget.RemoteViews f17;
        android.widget.RemoteViews d17;
        z2.e1 e1Var = new z2.e1(this);
        z2.k0 k0Var = e1Var.f550966b;
        z2.s0 s0Var = k0Var.f551001l;
        if (s0Var != null) {
            s0Var.b(e1Var);
        }
        android.widget.RemoteViews e17 = s0Var != null ? s0Var.e(e1Var) : null;
        int i17 = android.os.Build.VERSION.SDK_INT;
        android.app.Notification.Builder builder = e1Var.f550965a;
        if (i17 >= 26) {
            notification = z2.t0.a(builder);
        } else {
            android.app.Notification a17 = z2.t0.a(builder);
            int i18 = e1Var.f550968d;
            if (i18 != 0) {
                if (z2.w0.f(a17) != null && (a17.flags & 512) != 0 && i18 == 2) {
                    a17.sound = null;
                    a17.vibrate = null;
                    a17.defaults = a17.defaults & (-2) & (-3);
                }
                if (z2.w0.f(a17) != null && (a17.flags & 512) == 0 && i18 == 1) {
                    a17.sound = null;
                    a17.vibrate = null;
                    a17.defaults = a17.defaults & (-2) & (-3);
                }
            }
            notification = a17;
        }
        if (e17 != null) {
            notification.contentView = e17;
        } else {
            android.widget.RemoteViews remoteViews = k0Var.f551012w;
            if (remoteViews != null) {
                notification.contentView = remoteViews;
            }
        }
        if (s0Var != null && (d17 = s0Var.d(e1Var)) != null) {
            notification.bigContentView = d17;
        }
        if (s0Var != null && (f17 = k0Var.f551001l.f(e1Var)) != null) {
            notification.headsUpContentView = f17;
        }
        if (s0Var != null && (bundle = notification.extras) != null) {
            s0Var.a(bundle);
        }
        return notification;
    }

    public z2.k0 d(boolean z17) {
        h(16, z17);
        return this;
    }

    public z2.k0 e(java.lang.CharSequence charSequence) {
        this.f550995f = c(charSequence);
        return this;
    }

    public z2.k0 f(java.lang.CharSequence charSequence) {
        this.f550994e = c(charSequence);
        return this;
    }

    public z2.k0 g(int i17) {
        android.app.Notification notification = this.D;
        notification.defaults = i17;
        if ((i17 & 4) != 0) {
            notification.flags |= 1;
        }
        return this;
    }

    public final void h(int i17, boolean z17) {
        android.app.Notification notification = this.D;
        if (z17) {
            notification.flags = i17 | notification.flags;
        } else {
            notification.flags = (~i17) & notification.flags;
        }
    }

    public z2.k0 i(android.app.PendingIntent pendingIntent, boolean z17) {
        this.f550997h = pendingIntent;
        h(128, z17);
        return this;
    }

    public z2.k0 j(android.graphics.Bitmap bitmap) {
        p012xc85e97e9.p075x2eaf9f.p077x600aa8b.p078xcebc809e.C1090x3d9c397b c1090x3d9c397b;
        if (bitmap == null) {
            c1090x3d9c397b = null;
        } else {
            if (android.os.Build.VERSION.SDK_INT < 27) {
                android.content.res.Resources resources = this.f550990a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561786sm);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561785sl);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = java.lang.Math.min(dimensionPixelSize / java.lang.Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / java.lang.Math.max(1, bitmap.getHeight()));
                    bitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, (int) java.lang.Math.ceil(bitmap.getWidth() * min), (int) java.lang.Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            android.graphics.PorterDuff.Mode mode = p012xc85e97e9.p075x2eaf9f.p077x600aa8b.p078xcebc809e.C1090x3d9c397b.f92569k;
            bitmap.getClass();
            p012xc85e97e9.p075x2eaf9f.p077x600aa8b.p078xcebc809e.C1090x3d9c397b c1090x3d9c397b2 = new p012xc85e97e9.p075x2eaf9f.p077x600aa8b.p078xcebc809e.C1090x3d9c397b(1);
            c1090x3d9c397b2.f92571b = bitmap;
            c1090x3d9c397b = c1090x3d9c397b2;
        }
        this.f550998i = c1090x3d9c397b;
        return this;
    }

    public z2.k0 k(android.net.Uri uri) {
        android.app.Notification notification = this.D;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = z2.j0.a(z2.j0.e(z2.j0.c(z2.j0.b(), 4), 5));
        return this;
    }

    public z2.k0 l(z2.s0 s0Var) {
        if (this.f551001l != s0Var) {
            this.f551001l = s0Var;
            if (s0Var != null && s0Var.f551053a != this) {
                s0Var.f551053a = this;
                l(s0Var);
            }
        }
        return this;
    }

    public z2.k0 m(java.lang.CharSequence charSequence) {
        this.D.tickerText = c(charSequence);
        return this;
    }
}
