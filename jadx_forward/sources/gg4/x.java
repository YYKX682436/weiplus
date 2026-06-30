package gg4;

/* loaded from: classes8.dex */
public class x implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353315a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f353316b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.ActivityC18541xa7500d36 f353317c;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.ActivityC18541xa7500d36 activityC18541xa7500d36, java.lang.String str, int i17) {
        this.f353317c = activityC18541xa7500d36;
        this.f353315a = str;
        this.f353316b = i17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k
    public void a(boolean z17) {
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.ActivityC18541xa7500d36 activityC18541xa7500d36 = this.f353317c;
            android.widget.EditText editText = activityC18541xa7500d36.f253967n;
            java.lang.String obj = editText == null ? this.f353315a : editText.getText().toString();
            activityC18541xa7500d36.getClass();
            w11.o0 o0Var = new w11.o0(this.f353316b, obj);
            activityC18541xa7500d36.f253962f = db5.e1.Q(activityC18541xa7500d36, activityC18541xa7500d36.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC18541xa7500d36.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572085yb), true, true, new gg4.f0(activityC18541xa7500d36, o0Var));
            c01.d9.e().g(o0Var);
        }
    }
}
