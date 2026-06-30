package wt1;

/* loaded from: classes15.dex */
public class g implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: g, reason: collision with root package name */
    public int f530805g;

    /* renamed from: h, reason: collision with root package name */
    public int f530806h;

    /* renamed from: i, reason: collision with root package name */
    public int f530807i;

    /* renamed from: m, reason: collision with root package name */
    public int f530808m;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f530802d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f530803e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f530804f = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final int f530809n = 60;

    /* renamed from: o, reason: collision with root package name */
    public boolean f530810o = false;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f530811p = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new wt1.d(this), false);

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f530812q = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new wt1.e(this), false);

    public void a(java.lang.String str) {
        if (this.f530810o) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardCodeMgr", "doGetCardCodes(), is doing get codes");
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardCodeMgr", "doGetCardCodes(), mCardId is empty!");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardCodeMgr", "doGetCardCodes() do get codes, card id " + str);
        this.f530810o = true;
        this.f530803e = str;
        gm0.j1.n().f354821b.g(new xt1.j0(str));
    }

    public java.lang.String b() {
        java.util.LinkedList linkedList = this.f530804f;
        if (linkedList == null || linkedList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardCodeMgr", "getCode, codes is empty");
            return "";
        }
        if (this.f530805g >= linkedList.size()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardCodeMgr", "getCode, all codes has show! ");
            a(this.f530803e);
            return "";
        }
        if (this.f530807i >= linkedList.size() - this.f530805g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardCodeMgr", "do request code, because the request_count >= than (codes.size() - show_count)");
            a(this.f530803e);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardCodeMgr", "getCode, show_count:" + this.f530805g + " request_count:" + this.f530807i + " codes size:" + linkedList.size());
        int i17 = this.f530805g;
        this.f530805g = i17 + 1;
        return (java.lang.String) linkedList.get(i17);
    }

    public boolean c() {
        java.util.LinkedList linkedList = this.f530804f;
        if (linkedList == null || linkedList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardCodeMgr", "getCode, codes is empty");
            return true;
        }
        if (this.f530805g < linkedList.size()) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardCodeMgr", "getCode, all codes has show! ");
        return true;
    }

    public void d() {
        f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardCodeMgr", "startRefreshCodeTimer() refresh_interval:" + this.f530808m);
        int i17 = this.f530808m;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f530812q;
        if (i17 > 0) {
            long j17 = i17 * 1000;
            b4Var.c(j17, j17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardCodeMgr", "start refresh code timer!");
        } else {
            long j18 = this.f530809n * 1000;
            b4Var.c(j18, j18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardCodeMgr", "not to start refresh code timer!");
        }
    }

    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardCodeMgr", "stopRequestCodeTimer!");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f530811p;
        if (!b4Var.e()) {
            b4Var.d();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardCodeMgr", "startRequestCodeTimer() request_time:" + this.f530806h);
        if (this.f530806h <= 0 || android.text.TextUtils.isEmpty(this.f530803e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardCodeMgr", "not to start request code timer!");
            return;
        }
        long j17 = this.f530806h * 1000;
        b4Var.c(j17, j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardCodeMgr", "start request code timer!");
    }

    public void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardCodeMgr", "stopRefreshCodeTimer()!");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f530812q;
        if (b4Var.e()) {
            return;
        }
        b4Var.d();
    }

    public void g(wt1.f fVar) {
        wt1.f fVar2;
        if (this.f530802d == null || fVar == null) {
            return;
        }
        for (int i17 = 0; i17 < this.f530802d.size(); i17++) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.f530802d.get(i17);
            if (weakReference != null && (fVar2 = (wt1.f) weakReference.get()) != null && fVar2.equals(fVar)) {
                this.f530802d.remove(weakReference);
                return;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        wt1.f fVar;
        wt1.f fVar2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardCodeMgr", "onSceneEnd, errType = " + i17 + " errCode = " + i18);
        int i19 = 0;
        if (i17 != 0 || i18 != 0) {
            if (m1Var instanceof xt1.j0) {
                this.f530810o = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardCodeMgr", "get codes failed  for card id " + this.f530803e);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardCodeMgr", "onFail()");
                if (this.f530802d == null) {
                    return;
                }
                while (i19 < ((java.util.ArrayList) this.f530802d).size()) {
                    java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) this.f530802d).get(i19);
                    if (weakReference != null && (fVar = (wt1.f) weakReference.get()) != null) {
                        fVar.mo54446xc399519d(i18, str);
                    }
                    i19++;
                }
                return;
            }
            return;
        }
        if (m1Var instanceof xt1.j0) {
            this.f530810o = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardCodeMgr", "get codes success for card id " + this.f530803e);
            xt1.j0 j0Var = (xt1.j0) m1Var;
            this.f530806h = j0Var.f538037g;
            this.f530807i = j0Var.f538038h;
            this.f530808m = j0Var.f538039i;
            if (j0Var.f538036f != null) {
                java.util.LinkedList linkedList = this.f530804f;
                linkedList.clear();
                linkedList.addAll(j0Var.f538036f);
                this.f530805g = 0;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardCodeMgr", "onSuccess()");
            if (this.f530802d != null) {
                while (i19 < ((java.util.ArrayList) this.f530802d).size()) {
                    java.lang.ref.WeakReference weakReference2 = (java.lang.ref.WeakReference) ((java.util.ArrayList) this.f530802d).get(i19);
                    if (weakReference2 != null && (fVar2 = (wt1.f) weakReference2.get()) != null) {
                        fVar2.mo54447xe05b4124();
                    }
                    i19++;
                }
            }
            e();
            if (this.f530808m != 0) {
                d();
            }
        }
    }
}
