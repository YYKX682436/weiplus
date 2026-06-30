package wj1;

/* loaded from: classes14.dex */
public class k implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f528134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f528135e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wj1.c0 f528136f;

    public k(wj1.c0 c0Var, int i17, java.lang.String str) {
        this.f528136f = c0Var;
        this.f528134d = i17;
        this.f528135e = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("intent_err_code", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o1(java.lang.Integer.valueOf(this.f528134d), 0));
        java.lang.String str = this.f528135e;
        if (str == null) {
            str = "";
        }
        intent.putExtra("intent_err_msg", str);
        wj1.c0 c0Var = this.f528136f;
        c0Var.f528109a.setResult(1, intent);
        c0Var.f528109a.finish();
    }
}
