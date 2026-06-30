package uz4;

/* loaded from: classes12.dex */
public class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.p2455xc35232d7.C19532x15431705 f513710d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.p2455xc35232d7.C19532x15431705 c19532x15431705) {
        this.f513710d = c19532x15431705;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/NoteVoiceView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (iq.b.C(view.getContext()) || iq.b.v(view.getContext()) || iq.b.e(view.getContext())) {
            yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/NoteVoiceView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean b17 = fp.i.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.p2455xc35232d7.C19532x15431705 c19532x15431705 = this.f513710d;
        if (!b17 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19532x15431705.f269832n)) {
            db5.t7.k(view.getContext(), null);
            yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/NoteVoiceView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String str = c19532x15431705.f269832n;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        if (!str.equals(c19532x15431705.f269834p.f513699d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.p2455xc35232d7.C19532x15431705.e(c19532x15431705);
        } else if (c19532x15431705.f269834p.f()) {
            c19532x15431705.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NoteVoiceView", "pause play");
            uz4.d dVar = c19532x15431705.f269834p;
            dVar.getClass();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.c3.b("keep_app_silent");
            boolean d17 = ((sl.j) dVar.e()).d(true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NoteEditorVoiceHelper", "pause play, ret:%s", java.lang.Boolean.valueOf(d17));
            if (d17) {
                for (uz4.c cVar : dVar.f513707o) {
                    if (cVar != null) {
                        cVar.a();
                    }
                }
            }
            c19532x15431705.f();
        } else {
            c19532x15431705.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NoteVoiceView", "resume play");
            uz4.d dVar2 = c19532x15431705.f269834p;
            dVar2.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NoteEditorVoiceHelper", "resume play");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.c3.a("keep_app_silent");
            boolean e17 = ((sl.j) dVar2.e()).e();
            if (e17) {
                for (uz4.c cVar2 : dVar2.f513707o) {
                    if (cVar2 != null) {
                        cVar2.b(dVar2.f513699d);
                    }
                }
            }
            uz4.g gVar = c19532x15431705.f269835q;
            gVar.f513711a = false;
            gVar.mo50305x3d8a09a2(4096);
            com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.p2455xc35232d7.C19532x15431705 c19532x154317052 = gVar.f513716f;
            c19532x154317052.f269827f.setImageResource(com.p314xaae8f345.mm.R.raw.f81342xcd70a442);
            c19532x154317052.f269827f.setContentDescription(c19532x154317052.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572044x5));
            c19532x15431705.f269826e.setKeepScreenOn(true);
            if (!e17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.p2455xc35232d7.C19532x15431705.e(c19532x15431705);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/NoteVoiceView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
