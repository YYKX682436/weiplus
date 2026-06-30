package a31;

/* loaded from: classes5.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a31.m f965d;

    public l(a31.m mVar) {
        this.f965d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        a31.m mVar = this.f965d;
        com.tencent.mm.ui.widget.MMEditText mMEditText = mVar.f968b;
        if (mMEditText == null) {
            mVar.M = null;
            return;
        }
        if (mVar.f970d) {
            mVar.M = null;
            return;
        }
        a31.b bVar = mVar.M;
        if (bVar == null) {
            return;
        }
        mVar.N = android.os.SystemClock.uptimeMillis();
        java.lang.CharSequence charSequence = bVar.f944a;
        int length = charSequence.length();
        int f17 = e06.p.f(mVar.f988v, 0, length);
        int i17 = length - f17;
        if (i17 <= 0) {
            if (mVar.M == bVar) {
                mVar.M = null;
                return;
            } else {
                mVar.e(0L);
                return;
            }
        }
        int f18 = e06.p.f(2 <= i17 && i17 < 11 ? f17 + 1 : length, 0, length);
        mVar.f988v = f18;
        android.text.SpannableString spannableString = new android.text.SpannableString(charSequence.subSequence(0, f18));
        spannableString.setSpan(new a31.n(), 0, spannableString.length(), 33);
        android.text.Editable text = mMEditText.getText();
        int length2 = text != null ? text.length() : 0;
        int i18 = bVar.f945b;
        if (i18 == -1) {
            int i19 = bVar.f946c;
            if (f17 == 0) {
                int f19 = e06.p.f(i19, 0, length2);
                android.text.Editable text2 = mMEditText.getText();
                if (text2 != null) {
                    text2.insert(f19, spannableString);
                }
            } else {
                int f27 = e06.p.f(i19, 0, length2);
                int f28 = e06.p.f(i19 + f17, f27, length2);
                if (f27 >= length2) {
                    android.text.Editable text3 = mMEditText.getText();
                    if (text3 != null) {
                        text3.insert(length2, spannableString);
                    }
                } else {
                    android.text.Editable text4 = mMEditText.getText();
                    if (text4 != null) {
                        text4.replace(f27, f28, spannableString);
                    }
                }
            }
        } else {
            int f29 = e06.p.f(i18, 0, length2);
            int f37 = e06.p.f(i18 + f17, f29, length2);
            android.text.Editable text5 = mMEditText.getText();
            if (text5 != null) {
                text5.replace(f29, f37, spannableString);
            }
        }
        int i27 = length - mVar.f988v;
        if (i27 > 0) {
            mVar.e(i27 > 3 ? 40L : 60L);
        } else if (mVar.M == bVar) {
            mVar.M = null;
        } else {
            mVar.e(0L);
        }
    }
}
