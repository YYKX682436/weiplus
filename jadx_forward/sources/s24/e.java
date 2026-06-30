package s24;

/* loaded from: classes.dex */
public abstract class e extends s24.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // s24.f, a24.i
    /* renamed from: clone */
    public java.lang.Object mo446x5a5dd5d() {
        return super.mo446x5a5dd5d();
    }

    @Override // a24.i, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        super.mo451xac79a11b();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        m158354x19263085().getIntent().putExtra("setting_page_time", java.lang.String.valueOf(c01.id.c()));
    }

    @Override // a24.i
    public void r7(android.content.Context context, android.view.View itemView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        t7(m158354x19263085().getIntent());
        android.content.Intent intent = this.f483892g;
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent putExtra = intent.putExtra("key_config_item", a7());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(putExtra, "putExtra(...)");
        putExtra.putExtra("page_name_kv", a7());
        putExtra.putExtra("ui_version", 2);
        putExtra.putExtra("setting_from_source", m158354x19263085().getIntent().getIntExtra("setting_from_source", 2));
        putExtra.putExtra("setting_level", m7() + 1);
        putExtra.putExtra("setting_page_time", java.lang.String.valueOf(c01.id.c()));
        G7(context, putExtra);
        j45.l.j(context, "setting", ".ui.setting_new.CommonSettingsUI", putExtra, null);
    }
}
