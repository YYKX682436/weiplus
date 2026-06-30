package nh1;

/* loaded from: classes7.dex */
public class d implements nh1.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f418618a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f418619b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f418620c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f418621d;

    public d(nh1.e eVar, java.util.List list, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str) {
        this.f418618a = list;
        this.f418619b = context;
        this.f418620c = v5Var;
        this.f418621d = str;
    }

    @Override // nh1.g
    public void a(android.view.View view, int i17) {
        ((nh1.b) this.f418618a.get(i17)).a(this.f418619b, this.f418620c, this.f418621d);
    }
}
