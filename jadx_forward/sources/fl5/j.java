package fl5;

/* loaded from: classes5.dex */
public class j extends ck5.f {

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.ref.WeakReference f345486j;

    public j(java.lang.ref.WeakReference weakReference) {
        super("");
        this.f345486j = weakReference;
    }

    public static fl5.j g(fl5.i iVar) {
        return new fl5.j(new java.lang.ref.WeakReference(iVar));
    }

    @Override // ck5.f
    public int a() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f124092d)) {
            java.lang.ref.WeakReference weakReference = this.f345486j;
            if (weakReference == null) {
                return 1;
            }
            this.f124092d = ((fl5.i) weakReference.get()).getText().toString().trim();
        }
        int e17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.e(this.f124092d, this.f124095g);
        if (e17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.InputIEdtBoundaryCheck", "you are crazy =.=!that is 2 GB character!");
            return 2;
        }
        if (e17 < this.f124094f) {
            return 1;
        }
        return e17 > this.f124093e ? 2 : 0;
    }

    @Override // ck5.f
    public void c() {
        if (!this.f124089a) {
            java.lang.ref.WeakReference weakReference = this.f345486j;
            if (weakReference == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.InputIEdtBoundaryCheck", "edit text view is null");
                return;
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(this.f124096h)) {
                ((fl5.i) weakReference.get()).mo81583x7e4f2d39(new android.text.InputFilter[]{f(this.f124093e, this.f124095g)});
            } else {
                this.f124096h.add(f(this.f124093e, this.f124095g));
                java.util.ArrayList arrayList = this.f124096h;
                ((fl5.i) weakReference.get()).mo81583x7e4f2d39((android.text.InputFilter[]) arrayList.toArray(new android.text.InputFilter[arrayList.size()]));
            }
        }
        if (this.f124097i != null) {
            int a17 = a();
            if (a17 == 0) {
                this.f124097i.c1(this.f124092d);
            } else if (a17 == 1) {
                this.f124097i.R5(this.f124092d);
            } else {
                if (a17 != 2) {
                    return;
                }
                this.f124097i.w0(this.f124092d);
            }
        }
    }
}
