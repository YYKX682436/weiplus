package androidx.preference;

/* loaded from: classes13.dex */
public class c extends androidx.preference.Preference {
    public final long R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, java.util.List list, long j17) {
        super(context, null);
        java.lang.CharSequence charSequence = null;
        this.f11746J = com.tencent.mm.R.layout.a_m;
        android.content.Context context2 = this.f11747d;
        android.graphics.drawable.Drawable drawable = b3.l.getDrawable(context2, com.tencent.mm.R.drawable.agz);
        if ((drawable == null && this.f11757q != null) || (drawable != null && this.f11757q != drawable)) {
            this.f11757q = drawable;
            this.f11756p = 0;
            n();
        }
        this.f11756p = com.tencent.mm.R.drawable.agz;
        java.lang.String string = context2.getString(com.tencent.mm.R.string.c5w);
        if ((string == null && this.f11754n != null) || (string != null && !string.equals(this.f11754n))) {
            this.f11754n = string;
            n();
        }
        if (999 != this.f11753m) {
            this.f11753m = 999;
            androidx.preference.n nVar = this.L;
            if (nVar != null) {
                androidx.preference.x xVar = (androidx.preference.x) nVar;
                java.lang.Runnable runnable = xVar.f11853n;
                android.os.Handler handler = xVar.f11851i;
                handler.removeCallbacks(runnable);
                handler.post(runnable);
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.preference.Preference preference = (androidx.preference.Preference) it.next();
            java.lang.CharSequence charSequence2 = preference.f11754n;
            boolean z17 = preference instanceof androidx.preference.PreferenceGroup;
            if (z17 && !android.text.TextUtils.isEmpty(charSequence2)) {
                arrayList.add((androidx.preference.PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.N)) {
                if (z17) {
                    arrayList.add((androidx.preference.PreferenceGroup) preference);
                }
            } else if (!android.text.TextUtils.isEmpty(charSequence2)) {
                if (charSequence == null) {
                    charSequence = charSequence2;
                } else {
                    charSequence = this.f11747d.getString(com.tencent.mm.R.string.jnn, charSequence, charSequence2);
                }
            }
        }
        H(charSequence);
        this.R = j17 + 1000000;
    }

    @Override // androidx.preference.Preference
    public long i() {
        return this.R;
    }

    @Override // androidx.preference.Preference
    public void s(androidx.preference.f0 f0Var) {
        super.s(f0Var);
        f0Var.f11813e = false;
    }
}
