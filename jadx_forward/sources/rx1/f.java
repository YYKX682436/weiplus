package rx1;

/* loaded from: classes12.dex */
public class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1343xd1075a44.p1344xc35232d7.C13162x3ab5c6d7 f482489d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1343xd1075a44.p1344xc35232d7.C13162x3ab5c6d7 c13162x3ab5c6d7) {
        this.f482489d = c13162x3ab5c6d7;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        boolean e17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/widget/voiceview/VoiceView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (iq.b.C(view.getContext()) || iq.b.v(view.getContext()) || iq.b.e(view.getContext())) {
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/widget/voiceview/VoiceView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean b17 = fp.i.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1343xd1075a44.p1344xc35232d7.C13162x3ab5c6d7 c13162x3ab5c6d7 = this.f482489d;
        if (!b17 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c13162x3ab5c6d7.f178189n)) {
            db5.t7.k(view.getContext(), null);
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/widget/voiceview/VoiceView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String str = c13162x3ab5c6d7.f178189n;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        if (!str.equals(c13162x3ab5c6d7.f178191p.f482479e)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1343xd1075a44.p1344xc35232d7.C13162x3ab5c6d7.e(c13162x3ab5c6d7);
        } else if (c13162x3ab5c6d7.f178191p.c()) {
            c13162x3ab5c6d7.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NoteVoiceView", "pause play");
            rx1.d dVar = c13162x3ab5c6d7.f178191p;
            dVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordVoiceHelper", "pause play");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.c3.b("keep_app_silent");
            com.p314xaae8f345.mm.p944x882e457a.c1 c1Var = dVar.f482478d;
            if (c1Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordVoiceHelper", "pause play error, player is null");
            } else if (((sl.j) c1Var).d(true)) {
                for (rx1.c cVar : dVar.f482487p) {
                    if (cVar != null) {
                        cVar.a();
                    }
                }
            }
            rx1.g gVar = c13162x3ab5c6d7.f178192q;
            gVar.f482490a = true;
            gVar.mo50303x856b99f0(4096);
            com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1343xd1075a44.p1344xc35232d7.C13162x3ab5c6d7 c13162x3ab5c6d72 = gVar.f482495f;
            c13162x3ab5c6d72.f178184f.setImageResource(com.p314xaae8f345.mm.R.raw.f81341x5c0e6575);
            c13162x3ab5c6d72.f178184f.setContentDescription(c13162x3ab5c6d72.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572052xf));
            c13162x3ab5c6d7.f178183e.setKeepScreenOn(false);
        } else {
            c13162x3ab5c6d7.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NoteVoiceView", "resume play");
            rx1.d dVar2 = c13162x3ab5c6d7.f178191p;
            dVar2.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordVoiceHelper", "resume play");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.c3.a("keep_app_silent");
            com.p314xaae8f345.mm.p944x882e457a.c1 c1Var2 = dVar2.f482478d;
            if (c1Var2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordVoiceHelper", "resum play error, player is null");
                e17 = false;
            } else {
                e17 = ((sl.j) c1Var2).e();
                if (e17) {
                    for (rx1.c cVar2 : dVar2.f482487p) {
                        if (cVar2 != null) {
                            cVar2.b(dVar2.f482479e);
                        }
                    }
                }
            }
            rx1.g gVar2 = c13162x3ab5c6d7.f178192q;
            gVar2.f482490a = false;
            gVar2.mo50305x3d8a09a2(4096);
            com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1343xd1075a44.p1344xc35232d7.C13162x3ab5c6d7 c13162x3ab5c6d73 = gVar2.f482495f;
            c13162x3ab5c6d73.f178184f.setImageResource(com.p314xaae8f345.mm.R.raw.f81342xcd70a442);
            c13162x3ab5c6d73.f178184f.setContentDescription(c13162x3ab5c6d73.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572044x5));
            c13162x3ab5c6d7.f178183e.setKeepScreenOn(true);
            if (!e17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1343xd1075a44.p1344xc35232d7.C13162x3ab5c6d7.e(c13162x3ab5c6d7);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/widget/voiceview/VoiceView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
