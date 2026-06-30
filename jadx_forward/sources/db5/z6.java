package db5;

/* loaded from: classes11.dex */
public class z6 implements android.text.InputFilter {

    /* renamed from: d, reason: collision with root package name */
    public int f310128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a f310129e;

    public z6(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a c21516xe823d84a) {
        this.f310129e = c21516xe823d84a;
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        int f17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.f(spanned.toString()) + com.p314xaae8f345.mm.ui.p2740x696c9db.v4.f(charSequence.toString());
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a c21516xe823d84a = this.f310129e;
        if (i27 > i19) {
            int i28 = f17 - (i27 - i19);
            if (i28 > 36) {
                c21516xe823d84a.f279113i = true;
                this.f310128d = i28 - 36;
            } else {
                c21516xe823d84a.f279113i = false;
            }
        } else if (f17 > 36) {
            c21516xe823d84a.f279113i = true;
            this.f310128d = f17 - 36;
        } else {
            c21516xe823d84a.f279113i = false;
        }
        if (c21516xe823d84a.H && 1 == this.f310128d && charSequence.equals("\n")) {
            this.f310128d = 0;
        }
        if (c21516xe823d84a.C != null) {
            c21516xe823d84a.post(new db5.y6(this));
        }
        return f17 > 256 ? "" : charSequence;
    }
}
