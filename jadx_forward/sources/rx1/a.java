package rx1;

/* loaded from: classes12.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1343xd1075a44.p1344xc35232d7.C13161x2b1227db f482475d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1343xd1075a44.p1344xc35232d7.C13161x2b1227db c13161x2b1227db) {
        this.f482475d = c13161x2b1227db;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/widget/voiceview/EditorVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object[] objArr = new java.lang.Object[3];
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1343xd1075a44.p1344xc35232d7.C13161x2b1227db c13161x2b1227db = this.f482475d;
        objArr[0] = c13161x2b1227db.f178181h;
        objArr[1] = rx1.d.b().c() ? "true" : "false";
        objArr[2] = rx1.d.b().f482479e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NoteEditorVoiceBaseView", "clicked path:%s, player isPlay:%s, path:%s", objArr);
        if (iq.b.C(c13161x2b1227db.f178180g) || iq.b.v(c13161x2b1227db.f178180g) || iq.b.e(c13161x2b1227db.f178180g)) {
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/widget/voiceview/EditorVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!fp.i.b() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c13161x2b1227db.f178181h)) {
            db5.t7.k(view.getContext(), null);
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/widget/voiceview/EditorVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (hx1.g.a().f367156a) {
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/widget/voiceview/EditorVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String str = c13161x2b1227db.f178181h;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        if (!str.equals(rx1.d.b().f482479e)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1343xd1075a44.p1344xc35232d7.C13161x2b1227db.e(c13161x2b1227db);
        } else if (rx1.d.b().c()) {
            c13161x2b1227db.g();
            rx1.d.b().e();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1343xd1075a44.p1344xc35232d7.C13161x2b1227db.e(c13161x2b1227db);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/widget/voiceview/EditorVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
