package so2;

/* loaded from: classes10.dex */
public final class k6 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.y4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ so2.m6 f491990a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f491991b;

    public k6(so2.m6 m6Var, android.widget.TextView textView) {
        this.f491990a = m6Var;
        this.f491991b = textView;
    }

    public void a(boolean z17, android.text.SpannableStringBuilder spannableStringBuilder) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SyncGetImageModel", "onGetDescText type match isNeedRefresh:" + z17 + ' ' + ((java.lang.Object) spannableStringBuilder) + " pos:" + this.f491990a.f492020g + " hashCode:" + hashCode());
        if (!z17 || spannableStringBuilder == null) {
            return;
        }
        this.f491991b.setText(spannableStringBuilder);
    }
}
