package ob3;

/* loaded from: classes5.dex */
public class h implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f425591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f425592e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1823xed060d07.ActivityC16326x540b7c63 f425593f;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1823xed060d07.ActivityC16326x540b7c63 activityC16326x540b7c63, android.widget.EditText editText, android.widget.EditText editText2) {
        this.f425593f = activityC16326x540b7c63;
        this.f425591d = editText;
        this.f425592e = editText2;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        this.f425591d.setOnClickListener(null);
        this.f425592e.setOnClickListener(null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1823xed060d07.ActivityC16326x540b7c63 activityC16326x540b7c63 = this.f425593f;
        activityC16326x540b7c63.m66046x8f91b80(activityC16326x540b7c63.f226567n, 2, false);
        activityC16326x540b7c63.m66046x8f91b80(activityC16326x540b7c63.f226566m, 0, false);
    }
}
