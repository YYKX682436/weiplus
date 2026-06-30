package j12;

/* loaded from: classes12.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final j12.h f378699a;

    /* renamed from: b, reason: collision with root package name */
    public r45.zj0 f378700b;

    /* renamed from: c, reason: collision with root package name */
    public final bw5.ra f378701c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.kj0 f378702d;

    /* renamed from: e, reason: collision with root package name */
    public int f378703e;

    /* renamed from: f, reason: collision with root package name */
    public int f378704f;

    /* renamed from: g, reason: collision with root package name */
    public int f378705g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f378706h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f378707i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f378708j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f378709k;

    public i(r45.zj0 zj0Var) {
        this.f378707i = true;
        this.f378708j = false;
        this.f378700b = zj0Var;
        this.f378699a = j12.h.summary;
    }

    public r45.qj0 a(boolean z17) {
        if (!z17) {
            return null;
        }
        r45.qj0 qj0Var = new r45.qj0();
        if (this.f378700b == null) {
            this.f378700b = n22.k.a(this.f378701c);
        }
        r45.zj0 zj0Var = this.f378700b;
        qj0Var.f465565d = zj0Var.f473661d;
        qj0Var.f465566e = zj0Var.f473662e;
        qj0Var.f465567f = zj0Var.f473663f;
        qj0Var.f465568g = zj0Var.f473664g;
        qj0Var.f465569h = zj0Var.f473665h;
        qj0Var.f465570i = zj0Var.f473666i;
        qj0Var.f465571m = zj0Var.f473667m;
        qj0Var.f465572n = zj0Var.f473668n;
        qj0Var.f465575q = zj0Var.f473669o;
        qj0Var.f465577s = zj0Var.f473671q;
        qj0Var.A = zj0Var.f473677w;
        qj0Var.H = zj0Var.A;
        qj0Var.I = zj0Var.B;
        return qj0Var;
    }

    public void b(boolean z17, com.p314xaae8f345.mm.p2621x8fb0427b.f5 f5Var, boolean z18) {
        bw5.ra raVar;
        r45.zj0 zj0Var = this.f378700b;
        if (zj0Var == null && (raVar = this.f378701c) != null) {
            zj0Var = n22.k.a(raVar);
        }
        if (zj0Var == null) {
            return;
        }
        if (z18) {
            c(7);
            return;
        }
        boolean a17 = j12.g.a(zj0Var);
        boolean c17 = j12.g.c(zj0Var);
        boolean b17 = j12.g.b(zj0Var.f473668n, 8);
        boolean isEmpty = android.text.TextUtils.isEmpty(zj0Var.f473666i);
        int i17 = zj0Var.f473670p;
        boolean z19 = i17 > 0 && ((long) i17) < java.lang.System.currentTimeMillis();
        if (b17 && c17) {
            c(8);
            return;
        }
        if (z19) {
            c(-2);
            return;
        }
        if (a17) {
            c(3);
            if (c17 || isEmpty) {
                this.f378705g = 0;
                return;
            } else {
                this.f378705g = 1;
                return;
            }
        }
        if (c17 || isEmpty) {
            c(3);
            this.f378705g = 0;
        } else {
            this.f378705g = 1;
            c(4);
        }
    }

    public void c(int i17) {
        if (i17 == 7 && this.f378704f == 6 && this.f378707i) {
            this.f378706h = true;
        }
        this.f378704f = i17;
    }

    public i(bw5.ra raVar) {
        this.f378707i = true;
        this.f378708j = false;
        this.f378701c = raVar;
        this.f378699a = j12.h.item;
    }

    public i(r45.kj0 kj0Var) {
        this.f378707i = true;
        this.f378708j = false;
        this.f378702d = kj0Var;
        this.f378699a = j12.h.cellset;
    }
}
