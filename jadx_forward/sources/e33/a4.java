package e33;

/* loaded from: classes10.dex */
public class a4 implements t23.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f328652a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f328653b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 f328654c;

    public a4(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561, java.util.ArrayList arrayList, java.lang.String str) {
        this.f328654c = activityC15656x6f26b561;
        this.f328652a = arrayList;
        this.f328653b = str;
    }

    @Override // t23.n0
    public java.lang.String a() {
        return j33.d0.d(this.f328653b, null, -1);
    }

    @Override // t23.n0
    public void b(java.lang.String str) {
        ((ku5.t0) ku5.t0.f394148d).B(new e33.z3(this, str));
        t23.p0.h().h(this);
    }

    /* renamed from: toString */
    public java.lang.String m126852x9616526c() {
        return "fileKey:" + this.f328653b + " this: " + super.toString();
    }
}
