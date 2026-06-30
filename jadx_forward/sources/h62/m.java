package h62;

/* loaded from: classes9.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.cf3 f360733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h62.n f360734e;

    public m(h62.n nVar, r45.cf3 cf3Var) {
        this.f360734e = nVar;
        this.f360733d = cf3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        h62.n nVar = this.f360734e;
        nVar.getClass();
        r45.cf3 cf3Var = this.f360733d;
        if (cf3Var != null && cf3Var.f76492x92037252.f458492d == 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.LinkedList linkedList = cf3Var.f453054h;
            if (linkedList != null && linkedList.size() > 0) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.hm0 hm0Var = (r45.hm0) it.next();
                    j62.a aVar = new j62.a();
                    aVar.a(hm0Var.f457819g);
                    arrayList.add(aVar);
                }
            }
            h62.d vj6 = h62.d.vj();
            int i17 = cf3Var.f453052f;
            java.util.LinkedList linkedList2 = cf3Var.f453053g;
            vj6.Jj(i17, linkedList2, arrayList);
            nVar.I(cf3Var.f453050d);
            int i18 = cf3Var.f453051e;
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GET_EXPT_APP_INTERVAL_SEC_INT, java.lang.Integer.valueOf(i18));
            int i19 = cf3Var.f453055i;
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GET_EXPT_APP_NEED_LOCAL_LIST_INT, java.lang.Integer.valueOf(i19));
            java.lang.String str = cf3Var.f453056m;
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GET_EXPT_APP_GLOBAL_SEQ_STRING, str);
            if (nVar.f360737f == 0) {
                h62.d.vj().Cj(true);
            }
            java.lang.Object[] objArr = new java.lang.Object[5];
            objArr[0] = java.lang.Integer.valueOf(i18);
            objArr[1] = java.lang.Integer.valueOf(i19);
            objArr[2] = str;
            objArr[3] = java.lang.Integer.valueOf(arrayList.size());
            objArr[4] = java.lang.Integer.valueOf(linkedList2 != null ? linkedList2.size() : 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetExptApp", "updateExpt interval[%d] nextReqNeedLocalList[%d] globalSeq[%s] updateList[%d] deleteList[%d]", objArr);
            r3 = 1;
        }
        if (r3 != 0) {
            jx3.f.INSTANCE.mo68477x336bdfd8(863L, 156L, 1L, false);
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(863L, 157L, 1L, false);
        }
    }
}
