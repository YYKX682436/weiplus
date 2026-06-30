package kr3;

/* loaded from: classes11.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kr3.q0 f393023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f393024e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(kr3.q0 q0Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        super(0);
        this.f393023d = q0Var;
        this.f393024e = activityC0065xcd7aa112;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.ArrayList arrayList;
        kr3.q0 q0Var = this.f393023d;
        java.util.ArrayList<java.lang.String> stringArrayListExtra = q0Var.m158359x1e885992().getStringArrayListExtra("key_intent_assemble_uic_list");
        if (stringArrayListExtra != null) {
            arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = stringArrayListExtra.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Class.forName((java.lang.String) it.next()));
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            return arrayList;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4((java.lang.String) ((jz5.n) q0Var.f392965f).mo141623x754a37bb())) {
            return kz5.b0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.k1.class);
        }
        java.util.List list = kr3.q0.A;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f393024e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            if (((kr3.j) pf5.z.f435481a.a(activity).a((java.lang.Class) obj)).i7()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
