package p012xc85e97e9.p100xa8fcbcdb;

/* loaded from: classes13.dex */
public class c extends p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb {
    public final long R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, java.util.List list, long j17) {
        super(context, null);
        java.lang.CharSequence charSequence = null;
        this.f93279J = com.p314xaae8f345.mm.R.C30864xbddafb2a.a_m;
        android.content.Context context2 = this.f93280d;
        android.graphics.drawable.Drawable m9707x4a96be14 = b3.l.m9707x4a96be14(context2, com.p314xaae8f345.mm.R.C30861xcebc809e.agz);
        if ((m9707x4a96be14 == null && this.f93290q != null) || (m9707x4a96be14 != null && this.f93290q != m9707x4a96be14)) {
            this.f93290q = m9707x4a96be14;
            this.f93289p = 0;
            n();
        }
        this.f93289p = com.p314xaae8f345.mm.R.C30861xcebc809e.agz;
        java.lang.String string = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c5w);
        if ((string == null && this.f93287n != null) || (string != null && !string.equals(this.f93287n))) {
            this.f93287n = string;
            n();
        }
        if (999 != this.f93286m) {
            this.f93286m = 999;
            p012xc85e97e9.p100xa8fcbcdb.n nVar = this.L;
            if (nVar != null) {
                p012xc85e97e9.p100xa8fcbcdb.x xVar = (p012xc85e97e9.p100xa8fcbcdb.x) nVar;
                java.lang.Runnable runnable = xVar.f93386n;
                android.os.Handler handler = xVar.f93384i;
                handler.removeCallbacks(runnable);
                handler.post(runnable);
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb c1146x1fce98fb = (p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb) it.next();
            java.lang.CharSequence charSequence2 = c1146x1fce98fb.f93287n;
            boolean z17 = c1146x1fce98fb instanceof p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244;
            if (z17 && !android.text.TextUtils.isEmpty(charSequence2)) {
                arrayList.add((p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244) c1146x1fce98fb);
            }
            if (arrayList.contains(c1146x1fce98fb.N)) {
                if (z17) {
                    arrayList.add((p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244) c1146x1fce98fb);
                }
            } else if (!android.text.TextUtils.isEmpty(charSequence2)) {
                if (charSequence == null) {
                    charSequence = charSequence2;
                } else {
                    charSequence = this.f93280d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jnn, charSequence, charSequence2);
                }
            }
        }
        H(charSequence);
        this.R = j17 + 1000000;
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public long i() {
        return this.R;
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public void s(p012xc85e97e9.p100xa8fcbcdb.f0 f0Var) {
        super.s(f0Var);
        f0Var.f93346e = false;
    }
}
