package i23;

/* loaded from: classes12.dex */
public final class d implements e75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i23.e f369611d;

    public d(i23.e eVar) {
        this.f369611d = eVar;
    }

    @Override // e75.a
    /* renamed from: onChanged */
    public void mo2231x7bb163d5(java.lang.Object obj) {
        b23.a state = (b23.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        b23.f fVar = (b23.f) state.a(b23.f.class);
        if (fVar != null) {
            i23.e eVar = this.f369611d;
            boolean mo134670x74219ae7 = eVar.f369612d.f383768a.mo134670x74219ae7();
            boolean z17 = fVar.f98924b;
            if (!mo134670x74219ae7) {
                qv4.j jVar = eVar.f369612d;
                nv4.e eVar2 = jVar.f383769b;
                if (eVar2 != null) {
                    eVar2.f422256f = z17;
                    if (z17) {
                        eVar2.f422254d.post(new nv4.d(eVar2));
                    }
                }
                android.view.ViewGroup viewGroup = jVar.f383770c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(z17 ? 0 : 8);
                }
            }
            android.view.View view = eVar.f369613e;
            if (view != null) {
                int i17 = z17 ? 0 : 8;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/teach/FTSGlobalTeachUIC", "updateSettingVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/teach/FTSGlobalTeachUIC", "updateSettingVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (fVar.f98925c != b23.e.f98922e) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = eVar.m158354x19263085();
                com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 activityC15607x502bbbb2 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 ? (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2) m158354x19263085 : null;
                if (activityC15607x502bbbb2 == null) {
                    return;
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onEducationVisible: visible: ");
                sb6.append(z17 ? "true" : "false");
                sb6.append(", isQueryEmpty: ");
                sb6.append(activityC15607x502bbbb2.T ? "true" : "false");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", sb6.toString());
                activityC15607x502bbbb2.r7(z17);
            }
        }
    }
}
