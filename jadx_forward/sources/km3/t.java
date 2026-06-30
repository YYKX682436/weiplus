package km3;

/* loaded from: classes10.dex */
public final class t extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f390793d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f390794e;

    /* renamed from: f, reason: collision with root package name */
    public int f390795f;

    /* renamed from: g, reason: collision with root package name */
    public final int f390796g;

    /* renamed from: h, reason: collision with root package name */
    public final java.text.SimpleDateFormat f390797h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f390798i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View.OnClickListener f390799m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f390800n;

    /* renamed from: o, reason: collision with root package name */
    public km3.k f390801o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View.OnClickListener f390802p;

    public t(android.content.Context mContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mContext, "mContext");
        this.f390793d = mContext;
        this.f390794e = new java.util.ArrayList();
        this.f390795f = 2000;
        this.f390796g = Integer.MAX_VALUE;
        this.f390797h = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm", java.util.Locale.getDefault());
        this.f390798i = new java.util.LinkedList();
        this.f390799m = new km3.s(this);
        this.f390800n = new km3.r(this);
        this.f390802p = new km3.q(this);
        m8146xced61ae5();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f390798i.size() + this.f390794e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        java.util.LinkedList linkedList = this.f390798i;
        if (i17 < linkedList.size()) {
            return ((km3.j) linkedList.get(i17)).f390779a;
        }
        return 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        boolean z17 = holder instanceof km3.h;
        android.view.View.OnClickListener onClickListener = this.f390802p;
        if (z17) {
            holder.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.f566922hj2, java.lang.Integer.valueOf(i17));
            holder.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.hjv, 2);
            holder.f3639x46306858.setOnClickListener(onClickListener);
            return;
        }
        if (holder instanceof km3.g) {
            holder.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.f566922hj2, java.lang.Integer.valueOf(i17));
            holder.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.hjv, 1);
            holder.f3639x46306858.setOnClickListener(onClickListener);
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 x17 = x(i17);
            if (x17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Music.MusicMvAlbumAdapter", "get item failed");
                return;
            }
            java.lang.String o17 = x17.o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getThumbPath(...)");
            java.lang.String str2 = x17.f219963e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getOriginalPath(...)");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o17) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Music.MusicMvAlbumAdapter", "null or nil filepath, poi: %s.", java.lang.Integer.valueOf(i17));
                return;
            }
            km3.g gVar = (km3.g) holder;
            gVar.f390776d.setAlpha(1.0f);
            boolean z18 = z();
            android.widget.TextView textView = gVar.f390777e;
            android.widget.ImageView imageView = gVar.f390776d;
            android.widget.CheckBox delegate = gVar.f390778f;
            if (z18) {
                delegate.setChecked(x17.f219975t);
                if (x17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) {
                    textView.setVisibility(0);
                    km3.p.f390783i.a(gVar.f390777e, gVar.f390776d, (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) x17, this.f390795f, this.f390796g);
                } else {
                    textView.setVisibility(8);
                    if (x17.f219975t) {
                        imageView.setAlpha(0.1f);
                    } else {
                        imageView.setAlpha(1.0f);
                    }
                }
            } else {
                textView.setVisibility(8);
                if (x17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) {
                    textView.setVisibility(0);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b c15635xf0ea441b = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) x17;
                    km3.p.f390783i.a(gVar.f390777e, gVar.f390776d, c15635xf0ea441b, this.f390795f, this.f390796g);
                    if (lm3.d0.a(c15635xf0ea441b.f219979x) < lm3.d0.c(this.f390795f) || lm3.d0.a(c15635xf0ea441b.f219979x) > lm3.d0.c(this.f390796g)) {
                        imageView.setAlpha(0.1f);
                    } else {
                        imageView.setAlpha(1.0f);
                    }
                }
            }
            java.lang.String format = this.f390797h.format(new java.util.Date(x17.f219968m));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            java.lang.String str3 = (i17 + 1) + ", " + format;
            if (2 == x17.mo63659xfb85f7b0()) {
                str = "视频 " + str3;
            } else {
                str = "图片" + str3;
            }
            imageView.setContentDescription(str);
            ((o23.i) ((e60.b1) i95.n0.c(e60.b1.class))).Ai(gVar.f390776d, x17.mo63659xfb85f7b0(), o17, str2, x17.f219967i, x17.f219968m);
            gVar.f3639x46306858.setOnLongClickListener(this.f390800n);
            if (z()) {
                delegate.setVisibility(0);
            } else {
                delegate.setVisibility(8);
            }
            if (delegate.getVisibility() == 0) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
                java.lang.Object parent = delegate.getParent();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.View");
                android.view.View view = (android.view.View) parent;
                view.post(new km3.f(delegate, view));
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
                java.lang.Object parent2 = delegate.getParent();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent2, "null cannot be cast to non-null type android.view.View");
                ((android.view.View) parent2).setTouchDelegate(null);
            }
            delegate.setTag(com.p314xaae8f345.mm.R.id.f566922hj2, java.lang.Integer.valueOf(i17));
            delegate.setOnClickListener(this.f390799m);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.content.Context context = this.f390793d;
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c49, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            return new km3.g(inflate);
        }
        if (i17 != 2) {
            android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c49, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
            return new km3.g(inflate2);
        }
        android.view.View inflate3 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c4x, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate3, "inflate(...)");
        return new km3.h(inflate3);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 x(int i17) {
        java.util.LinkedList linkedList = this.f390798i;
        if (i17 < linkedList.size()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Music.MusicMvAlbumAdapter", "get header, pos[%d]", java.lang.Integer.valueOf(i17));
            return null;
        }
        int size = i17 - linkedList.size();
        java.util.ArrayList arrayList = this.f390794e;
        if (size < arrayList.size()) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) arrayList.get(size);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Music.MusicMvAlbumAdapter", "get item error, media items size[%d], adjustPos[%d]", java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(size));
        return null;
    }

    public final int y() {
        return this.f390794e.size();
    }

    public final boolean z() {
        android.content.Context context = this.f390793d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c3) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c3.class)).P6();
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }
}
