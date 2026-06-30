package a24;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingPrefUI f896d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingPrefUI baseSettingPrefUI) {
        super(1);
        this.f896d = baseSettingPrefUI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.setting.ui.setting_new.uic.d dVar;
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView;
        r24.f state = (r24.f) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof r24.e)) {
            java.lang.String c76 = ((a24.i) ((r24.e) dVar2).f368852b.f302833d).c7();
            com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingPrefUI baseSettingPrefUI = this.f896d;
            baseSettingPrefUI.setMMTitle(c76);
            int i17 = com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingPrefUI.f161837h;
            java.util.Iterator it = baseSettingPrefUI.getUiComponents().iterator();
            while (true) {
                if (!it.hasNext()) {
                    dVar = 0;
                    break;
                }
                dVar = it.next();
                if (((com.tencent.mm.ui.component.UIComponent) dVar) instanceof com.tencent.mm.plugin.setting.ui.setting_new.uic.d) {
                    break;
                }
            }
            com.tencent.mm.plugin.setting.ui.setting_new.uic.d dVar3 = dVar instanceof com.tencent.mm.plugin.setting.ui.setting_new.uic.d ? dVar : null;
            if (dVar3 != null && (mvvmList = dVar3.f890d) != null && (wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) baseSettingPrefUI.findViewById(com.tencent.mm.R.id.lqa)) != null) {
                wxRecyclerView.post(new a24.o(baseSettingPrefUI, mvvmList));
            }
        }
        return jz5.f0.f302826a;
    }
}
