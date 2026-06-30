package os3;

/* loaded from: classes11.dex */
public class j3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f429656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f429657e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f429658f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f429659g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16940x12c392bf f429660h;

    public j3(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16940x12c392bf activityC16940x12c392bf, android.widget.EditText editText, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f429660h = activityC16940x12c392bf;
        this.f429656d = editText;
        this.f429657e = str;
        this.f429658f = str2;
        this.f429659g = str3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.widget.EditText editText = this.f429656d;
        if (editText.getText() == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(editText.getText())) {
            return;
        }
        java.lang.String obj = editText.getText().toString();
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16940x12c392bf.f236447p;
        this.f429660h.U6(this.f429657e, this.f429658f, this.f429659g, obj);
    }
}
