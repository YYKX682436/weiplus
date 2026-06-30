package eo5;

/* loaded from: classes.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f337128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eo5.e f337129e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z17, eo5.e eVar) {
        super(1);
        this.f337128d = z17;
        this.f337129e = eVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.content.Intent intent;
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        wi5.c0 c0Var = (wi5.c0) state.a(wi5.c0.class);
        if (c0Var != null) {
            java.util.List namelist = c0Var.f527815b;
            boolean z17 = this.f337128d;
            eo5.e eVar = this.f337129e;
            if (z17) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = eVar.m158354x19263085();
                android.content.Intent intent2 = eVar.m158354x19263085().getIntent();
                if (intent2 != null) {
                    java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
                    arrayList.addAll(namelist);
                    intent = intent2.putStringArrayListExtra("Select_Contact", arrayList);
                } else {
                    intent = null;
                }
                m158354x19263085.setResult(-1, intent);
                eVar.m158354x19263085().finish();
            } else {
                n13.d0 d0Var = (n13.d0) i95.n0.c(n13.d0.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = eVar.m158354x19263085();
                eo5.c cVar = new eo5.c(eVar);
                ((dk5.e0) d0Var).getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(namelist, "namelist");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                android.content.Intent putExtra = new android.content.Intent().putExtra("Select_Conv_User", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(namelist, ","));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(putExtra, "putExtra(...)");
                pf5.j0.a(putExtra, gk5.r1.class);
                bh5.c cVar2 = new bh5.c();
                cVar2.d(putExtra);
                bh5.d dVar = cVar2.f102455a;
                dVar.f102457a = activity;
                cVar2.b(com.p314xaae8f345.mm.p689xc5a27af6.p749xd7a392c5.ui.C10607xab9347fc.class);
                cVar2.c(false);
                dVar.f102460d.w(1);
                cVar2.a(com.p314xaae8f345.mm.p689xc5a27af6.p749xd7a392c5.ui.ActivityC10608xcce92520.class.getName());
                cVar2.i(new dk5.d0(cVar));
            }
        }
        return jz5.f0.f384359a;
    }
}
