package e23;

/* loaded from: classes12.dex */
public class x1 extends u13.g {

    /* renamed from: q, reason: collision with root package name */
    public p13.y f328521q;

    /* renamed from: r, reason: collision with root package name */
    public long f328522r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.CharSequence f328523s;

    /* renamed from: t, reason: collision with root package name */
    public h45.v f328524t;

    /* renamed from: u, reason: collision with root package name */
    public final e23.v1 f328525u;

    /* renamed from: v, reason: collision with root package name */
    public final e23.w1 f328526v;

    public x1(int i17) {
        super(16, i17);
        this.f328524t = null;
        this.f328525u = new e23.v1(this, this.f505298h);
        this.f328526v = new e23.w1(this);
    }

    @Override // u13.g
    public void a(android.content.Context context, u13.e eVar, java.lang.Object... objArr) {
        p13.y yVar = this.f328521q;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(yVar.f432720e, yVar.f432719d);
        h45.v a17 = h45.v.a(Li.j());
        this.f328524t = a17;
        int i17 = a17.f360488b;
        java.util.List list = a17.f360498l;
        if (i17 == 0) {
            h45.u uVar = new h45.u();
            uVar.f360484a = "";
            uVar.f360485b = a17.f360489c;
            ((java.util.ArrayList) list).add(uVar);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17.f360496j)) {
            h45.u uVar2 = new h45.u();
            uVar2.f360484a = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ie7);
            uVar2.f360485b = a17.f360496j;
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            if (arrayList.size() <= 0 || !((h45.u) arrayList.get(0)).f360486c) {
                arrayList.add(0, uVar2);
            } else {
                arrayList.add(1, uVar2);
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17.f360497k)) {
            h45.u uVar3 = new h45.u();
            uVar3.f360484a = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574484ie4);
            uVar3.f360485b = a17.f360497k;
            java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
            if (arrayList2.size() <= 0 || !((h45.u) arrayList2.get(0)).f360486c) {
                arrayList2.add(0, uVar3);
            } else {
                arrayList2.add(1, uVar3);
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17.f360495i)) {
            h45.u uVar4 = new h45.u();
            uVar4.f360484a = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ie6);
            uVar4.f360485b = a17.f360495i;
            java.util.ArrayList arrayList3 = (java.util.ArrayList) list;
            if (arrayList3.size() <= 0 || !((h45.u) arrayList3.get(0)).f360486c) {
                arrayList3.add(0, uVar4);
            } else {
                arrayList3.add(1, uVar4);
            }
        }
        this.f328522r = Li.m124847x74d37ac6();
        this.f328523s = k35.m1.f(context, this.f328521q.f432721f, true, false);
    }

    @Override // u13.g
    public int j() {
        return this.f328521q.f432733r;
    }

    @Override // u13.g
    public u13.f k() {
        return this.f328525u;
    }
}
