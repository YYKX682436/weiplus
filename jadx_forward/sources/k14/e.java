package k14;

/* loaded from: classes.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f384854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f384855e;

    public e(p3325xe03a0797.p3326xc267989b.q qVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var) {
        this.f384854d = qVar;
        this.f384855e = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/model/ApplyForPhoneNumberUtil$showDialog$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3325xe03a0797.p3326xc267989b.q qVar = this.f384854d;
        if (!((p3325xe03a0797.p3326xc267989b.r) qVar).o()) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
        }
        this.f384855e.B();
        yj0.a.h(this, "com/tencent/mm/plugin/setting/model/ApplyForPhoneNumberUtil$showDialog$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
