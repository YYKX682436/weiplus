package fc2;

/* loaded from: classes2.dex */
public final class w extends fc2.t {

    /* renamed from: p, reason: collision with root package name */
    public long f342533p;

    /* renamed from: q, reason: collision with root package name */
    public int f342534q;

    /* renamed from: r, reason: collision with root package name */
    public int f342535r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.List f342536s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.List f342537t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.LinkedList f342538u;

    public w(int i17) {
        super(i17);
        this.f342533p = -1L;
        this.f342534q = -1;
        this.f342535r = -1;
    }

    public final java.util.List g() {
        return this.f342536s;
    }

    public final long h() {
        return this.f342533p;
    }

    public final int i() {
        return this.f342534q;
    }

    public final int j() {
        return this.f342535r;
    }

    public final java.util.List k() {
        return this.f342537t;
    }

    public final java.util.LinkedList l() {
        return this.f342538u;
    }

    /* renamed from: toString */
    public java.lang.String m129338x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ScrollEvent(type=");
        sb6.append(this.f342518d);
        sb6.append(", ");
        sb6.append(this.f342519e);
        sb6.append(", ");
        sb6.append(this.f342520f);
        sb6.append(", ");
        sb6.append(this.f342521g);
        sb6.append(", ");
        sb6.append(this.f342522h);
        sb6.append(", itemCount=");
        sb6.append(this.f342523i);
        sb6.append(", newState=");
        sb6.append(this.f342524j);
        sb6.append(") idleAcrossFeedList=");
        java.util.List list = this.f342536s;
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        return sb6.toString();
    }
}
