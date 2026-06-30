package yk2;

/* loaded from: classes3.dex */
public final class m extends yk2.g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.view.ViewGroup root) {
        super(root);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
    }

    @Override // yk2.g
    public void a(r45.lk2 response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        this.f544325e = response;
        dk2.ef efVar = dk2.ef.f314905a;
        boolean z17 = dk2.ef.D;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveReservedRecordPersonal", "checkPersonalItemShow enable_reserved_notice_record: " + z17);
        this.f544324d.setVisibility(z17 ? 0 : 8);
    }

    @Override // yk2.g
    public int c() {
        return 8;
    }

    @Override // yk2.g
    public void d() {
        android.content.Intent intent = new android.content.Intent();
        android.view.ViewGroup viewGroup = this.f544324d;
        android.content.Intent intent2 = !(viewGroup.getContext() instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(viewGroup.getContext(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14032xac67445f.class);
        android.content.Context context = viewGroup.getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/personal/LiveReservedRecordPersonalItem", "onContentClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/live/personal/LiveReservedRecordPersonalItem", "onContentClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
