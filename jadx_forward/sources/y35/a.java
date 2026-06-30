package y35;

/* loaded from: classes.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19703xb0984f96 f540716d;

    public a(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19703xb0984f96 c19703xb0984f96) {
        this.f540716d = c19703xb0984f96;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/preference/AccountInfoPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((f50.c0) i95.n0.c(f50.c0.class)).getClass();
        android.content.Intent intent = new android.content.Intent();
        if (((u24.h) ((ct.c3) i95.n0.c(ct.c3.class))).wi()) {
            intent.putExtra("key_config_item", "SettingGroup_Main_PersonalInfo");
            intent.putExtra("page_name_kv", "SettingGroup_Main_PersonalInfo");
            intent.putExtra("ui_version", 2);
            intent.putExtra("setting_from_source", 2);
            intent.putExtra("setting_level", 2);
            intent.putExtra("setting_page_time", java.lang.String.valueOf(c01.id.c()));
            str = ".ui.setting_new.CommonSettingsUI";
        } else {
            str = ".ui.setting.SettingsPersonalInfoUI";
        }
        j45.l.j(this.f540716d.f279303d, "setting", str, intent, null);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/preference/AccountInfoPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
