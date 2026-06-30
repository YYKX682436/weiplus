package wt3;

/* loaded from: classes5.dex */
public final class k {
    public k(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final r45.iz6 a(com.p314xaae8f345.p457x3304c6.p483x6a710b1.C4204xc1bc4e9c mjVideoClassifierResult, java.lang.String modelKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mjVideoClassifierResult, "mjVideoClassifierResult");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modelKey, "modelKey");
        r45.iz6 iz6Var = new r45.iz6();
        int[] iArr = mjVideoClassifierResult.f130104d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(iArr, "getAudioTaskOutLabels(...)");
        iz6Var.f458953g = new java.util.LinkedList(kz5.v.e(iArr));
        float[] fArr = mjVideoClassifierResult.f130105e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fArr, "getAudioTaskOutScores(...)");
        iz6Var.f458954h = new java.util.LinkedList(kz5.v.d(fArr));
        float[] fArr2 = mjVideoClassifierResult.f130106f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fArr2, "getLastVersionOutScores(...)");
        iz6Var.f458955i = new java.util.LinkedList(kz5.v.d(fArr2));
        int[] iArr2 = mjVideoClassifierResult.f130101a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(iArr2, "getVisionTaskOutLabels(...)");
        iz6Var.f458950d = new java.util.LinkedList(kz5.v.e(iArr2));
        float[] fArr3 = mjVideoClassifierResult.f130103c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fArr3, "getVisionTaskOutScores(...)");
        iz6Var.f458952f = new java.util.LinkedList(kz5.v.d(fArr3));
        int[] iArr3 = mjVideoClassifierResult.f130102b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(iArr3, "getVisionTaskExceedsThreshold(...)");
        iz6Var.f458951e = new java.util.LinkedList(kz5.v.e(iArr3));
        float[] fArr4 = mjVideoClassifierResult.f130108h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fArr4, "getEmbeddingFeature(...)");
        iz6Var.f458957n = new java.util.LinkedList(kz5.v.d(fArr4));
        java.lang.String g17 = p05.a3.f431972a.g(modelKey);
        if (g17 == null) {
            g17 = "";
        }
        iz6Var.f458958o = g17;
        wt3.k kVar = wt3.q.f531003g;
        java.util.Map map = mjVideoClassifierResult.f130107g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(map, "getClusters(...)");
        java.util.HashMap hashMap = (java.util.HashMap) map;
        java.util.ArrayList arrayList = new java.util.ArrayList(hashMap.size());
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            int intValue = ((java.lang.Number) entry.getKey()).intValue();
            int intValue2 = ((java.lang.Number) entry.getValue()).intValue();
            r45.pi0 pi0Var = new r45.pi0();
            pi0Var.f464603d = intValue;
            pi0Var.f464604e = intValue2;
            arrayList.add(pi0Var);
        }
        iz6Var.f458956m = new java.util.LinkedList(arrayList);
        iz6Var.f458957n.size();
        iz6Var.f458956m.size();
        return iz6Var;
    }

    public final java.util.List b(java.util.List businessModelKeyList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(businessModelKeyList, "businessModelKeyList");
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
        wt3.k kVar = wt3.q.f531003g;
        arrayList.addAll(wt3.q.f531004h);
        arrayList.addAll(businessModelKeyList);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.String str : arrayList) {
            p05.a3 a3Var = p05.a3.f431972a;
            java.lang.String g17 = a3Var.g(str);
            if (g17 != null) {
                linkedList.add(new com.p314xaae8f345.p457x3304c6.p477x633fb29.C4115x6599ae5a(str, g17, a3Var.h(str)));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioMaasClassifier", "[getModelInfos] key:" + str + " path:" + g17);
        }
        return linkedList;
    }
}
