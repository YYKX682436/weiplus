package nv2;

/* loaded from: classes2.dex */
public class g1 extends nv2.r {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f422024d;

    /* renamed from: e, reason: collision with root package name */
    public final long f422025e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f422026f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f422027g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f422028h;

    /* renamed from: i, reason: collision with root package name */
    public final int f422029i;

    /* renamed from: j, reason: collision with root package name */
    public final int f422030j;

    /* renamed from: k, reason: collision with root package name */
    public final r45.qt2 f422031k;

    /* renamed from: l, reason: collision with root package name */
    public final r45.bc1 f422032l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f422033m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderObject, long j17, java.lang.String objectNonceId, boolean z17, boolean z18, int i17, int i18, nv2.i1 i1Var, r45.qt2 contextObj, r45.bc1 bc1Var) {
        super(i1Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectNonceId, "objectNonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        this.f422024d = finderObject;
        this.f422025e = j17;
        this.f422026f = objectNonceId;
        this.f422027g = z17;
        this.f422028h = z18;
        this.f422029i = i17;
        this.f422030j = i18;
        this.f422031k = contextObj;
        this.f422032l = bc1Var;
        this.f422033m = "";
    }

    @Override // nv2.r
    public void a(nv2.o1 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        super.a(callback);
        long j17 = this.f422025e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f422024d;
        new db2.x1(new db2.c5(j17, c14994x9b99c079.m59229xb5af1dd5(), this.f422026f, this.f422027g, this.f422028h, this.f422029i, this.f422030j, c14994x9b99c079.getEncryptedObjectId(), this.f422033m, this.f422032l), this.f422031k).l().K(new nv2.f1(this, callback));
    }

    @Override // nv2.r
    public java.lang.String c() {
        return "id_" + this.f422025e + '_' + this.f422027g;
    }

    /* renamed from: toString */
    public java.lang.String m150137x9616526c() {
        return "action_" + this.f422025e + '_' + this.f422027g + '_' + this.f422029i + '_' + this.f422108c;
    }
}
