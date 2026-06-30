package s65;

/* loaded from: classes11.dex */
public class y extends android.os.AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p971x6de15a2e.h2 f485086a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f485087b = 200;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f f485088c = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f485089d;

    /* renamed from: e, reason: collision with root package name */
    public final q65.b f485090e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s65.z f485091f;

    public y(s65.z zVar, java.lang.String str, q65.b bVar) {
        this.f485091f = zVar;
        this.f485089d = null;
        this.f485090e = null;
        this.f485089d = str;
        this.f485090e = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0133, code lost:
    
        if (r0 != null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x024f, code lost:
    
        if (r0 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0251, code lost:
    
        r0.mo48348x1f9d589c();
        r39.f485086a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0257, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x026d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x025d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0242 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0232 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doInBackground(java.lang.Object[] r40) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s65.y.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        com.p314xaae8f345.mm.p971x6de15a2e.h2 h2Var = this.f485086a;
        if (h2Var != null) {
            h2Var.mo48348x1f9d589c();
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        r45.yp3 yp3Var = (r45.yp3) obj;
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = this.f485088c;
        int i17 = c19767x257d7f.f38864x6ac9171;
        java.util.Objects.toString(yp3Var);
        this.f485090e.d(this.f485087b, c19767x257d7f.f38864x6ac9171, yp3Var);
    }
}
