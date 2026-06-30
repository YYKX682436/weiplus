package f33;

/* loaded from: classes10.dex */
public class d implements ck5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f340846a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 f340847b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f340848c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f33.e f340849d;

    public d(f33.e eVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078, android.view.View view) {
        this.f340849d = eVar;
        this.f340846a = i17;
        this.f340847b = abstractC15633xee433078;
        this.f340848c = view;
    }

    @Override // ck5.b
    public void a() {
        f33.e eVar = this.f340849d;
        x.d dVar = eVar.Q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = this.f340847b;
        dVar.add(abstractC15633xee433078.f219963e);
        if (!eVar.B) {
            android.content.Context context = eVar.N;
            db5.e1.s(context, "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oeh));
        }
        boolean contains = eVar.f328664g.contains(abstractC15633xee433078);
        android.view.View view = this.f340848c;
        if (view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22625xc06c7fec) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22625xc06c7fec) view).setChecked(contains);
        }
        eVar.m8148xed6e4d18(this.f340846a, "update_disable_state");
    }

    @Override // ck5.b
    public void b(ck5.c cVar) {
        this.f340849d.R(this.f340846a, this.f340847b, this.f340848c);
    }
}
