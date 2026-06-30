package jq4;

/* loaded from: classes5.dex */
public final class b0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jq4.c0 f382657d;

    public b0(jq4.c0 c0Var) {
        this.f382657d = c0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        jq4.c0 c0Var = this.f382657d;
        android.widget.TextView textView = c0Var.f382664c;
        if (textView != null) {
            java.lang.String[] strArr = c0Var.f382662a;
            textView.setText(strArr[c0Var.f382666e % strArr.length]);
        }
        c0Var.f382666e++;
        return true;
    }
}
