package k83;

/* loaded from: classes14.dex */
public class g {
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g A;
    public java.lang.String F;
    public java.lang.String G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f386430J;
    public java.lang.String K;
    public int L;

    /* renamed from: a, reason: collision with root package name */
    public int f386431a;

    /* renamed from: b, reason: collision with root package name */
    public long f386432b;

    /* renamed from: c, reason: collision with root package name */
    public long f386433c;

    /* renamed from: d, reason: collision with root package name */
    public int f386434d;

    /* renamed from: e, reason: collision with root package name */
    public int f386435e;

    /* renamed from: f, reason: collision with root package name */
    public int f386436f;

    /* renamed from: g, reason: collision with root package name */
    public int f386437g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f386438h;

    /* renamed from: i, reason: collision with root package name */
    public int f386439i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f386440j;

    /* renamed from: k, reason: collision with root package name */
    public int f386441k;

    /* renamed from: l, reason: collision with root package name */
    public int f386442l;

    /* renamed from: m, reason: collision with root package name */
    public int f386443m;

    /* renamed from: n, reason: collision with root package name */
    public int f386444n;

    /* renamed from: o, reason: collision with root package name */
    public int f386445o;

    /* renamed from: u, reason: collision with root package name */
    public int f386451u;

    /* renamed from: v, reason: collision with root package name */
    public int f386452v;

    /* renamed from: w, reason: collision with root package name */
    public int f386453w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f386454x;

    /* renamed from: y, reason: collision with root package name */
    public int f386455y;

    /* renamed from: z, reason: collision with root package name */
    public int f386456z;

    /* renamed from: p, reason: collision with root package name */
    public boolean f386446p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f386447q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f386448r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f386449s = true;

    /* renamed from: t, reason: collision with root package name */
    public int f386450t = 0;
    public java.util.LinkedList B = new java.util.LinkedList();
    public java.util.LinkedList C = new java.util.LinkedList();
    public int D = 999;
    public final java.util.LinkedList E = new java.util.LinkedList();
    public boolean M = false;

    public int a() {
        java.util.LinkedList linkedList = this.E;
        return (linkedList == null || linkedList.size() <= 0) ? this.f386443m : ((k83.h) linkedList.get(0)).f386457a;
    }

    public int b() {
        java.util.LinkedList linkedList = this.E;
        return (linkedList == null || linkedList.size() <= 0) ? this.f386442l : ((k83.h) linkedList.get(0)).f386458b;
    }

    /* renamed from: toString */
    public java.lang.String m142109x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("IPCallInfo: ");
        sb6.append(java.lang.String.format("[roomId: %d, roomKey: %d, callSeq: %d, inviteId: %d, roomMemberId: %d, syncKey: %d, syncInterval: %d, currentStatus: %d, ErrMsg: %s, ErrCode：%d, ErrLevel：%d]\n", java.lang.Integer.valueOf(this.f386431a), java.lang.Long.valueOf(this.f386432b), java.lang.Long.valueOf(this.f386433c), java.lang.Integer.valueOf(this.f386434d), java.lang.Integer.valueOf(this.f386441k), java.lang.Integer.valueOf(this.f386442l), java.lang.Integer.valueOf(this.f386444n), java.lang.Integer.valueOf(this.f386443m), this.f386438h, java.lang.Integer.valueOf(this.f386437g), java.lang.Integer.valueOf(this.f386439i)));
        sb6.append(java.lang.String.format("[toUsername: %s, toPhoneNumber: %s]\n", this.I, this.f386430J));
        sb6.append("[addrList: ");
        java.util.Iterator it = this.B.iterator();
        while (it.hasNext()) {
            r45.fe5 fe5Var = (r45.fe5) it.next();
            sb6.append(java.lang.String.format("{IP: %s, port: %d}", fe5Var.f455789d, java.lang.Integer.valueOf(fe5Var.f455790e)));
        }
        sb6.append("]\n");
        java.util.LinkedList linkedList = this.E;
        if (linkedList == null || linkedList.size() <= 0) {
            sb6.append("userInfoList is empty");
        } else {
            sb6.append("[userInfoList: ");
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                k83.h hVar = (k83.h) it6.next();
                sb6.append("{");
                sb6.append(hVar.m142110x9616526c());
                sb6.append("}");
            }
            sb6.append("]");
        }
        return sb6.toString();
    }
}
