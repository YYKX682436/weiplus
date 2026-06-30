package oj4;

/* loaded from: classes11.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final oj4.j f427348a = new oj4.j();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f427349b = new oj4.h(android.os.Looper.getMainLooper());

    public final java.lang.String a(pj4.g2 g2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(g2Var, "<this>");
        return "[" + g2Var.hashCode() + "], rowId:" + g2Var.f436602n + " cdnSuccess:" + g2Var.f436603o + " cdnRetryNum:" + g2Var.f436600i + " cgiRetryNum:" + g2Var.f436601m + " id:" + g2Var.f436606r + " createTime:" + g2Var.f436595d.f436515q;
    }

    public final pj4.g2 b(int i17) {
        byte[] j17;
        pj4.f2 f2Var = new pj4.f2();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 c17 = c();
        java.lang.Object obj = null;
        if (c17 == null || (j17 = c17.j("upload_cache_array")) == null) {
            return null;
        }
        f2Var.mo11468x92b714fd(j17);
        java.util.LinkedList infoArray = f2Var.f436577d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(infoArray, "infoArray");
        java.util.Iterator it = infoArray.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((pj4.g2) next).f436595d.f436515q == i17) {
                obj = next;
                break;
            }
        }
        return (pj4.g2) obj;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 c() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("text_status_upload" + gm0.m.i());
    }

    public final void d(mj4.h hVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click to reCommit, ");
        sb6.append(hVar != null ? ((mj4.k) hVar).l() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.UploadManager", sb6.toString());
        if (hVar == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new oj4.f(hVar));
    }

    public final void e(int i17) {
        byte[] j17;
        pj4.f2 f2Var = new pj4.f2();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 c17 = c();
        if (c17 == null || (j17 = c17.j("upload_cache_array")) == null) {
            return;
        }
        f2Var.mo11468x92b714fd(j17);
        java.util.LinkedList infoArray = f2Var.f436577d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(infoArray, "infoArray");
        pm0.v.d0(infoArray, new oj4.g(i17));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 c18 = c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.UploadManager", "removeUploadTask result:" + (c18 != null ? java.lang.Boolean.valueOf(c18.H("upload_cache_array", f2Var.mo14344x5f01b1f6())) : null) + " createTime:" + i17);
    }

    public final void f(pj4.g2 g2Var) {
        android.os.Message message = new android.os.Message();
        message.obj = g2Var;
        f427349b.mo50308x2936bf5f(message);
    }

    public final void g(pj4.g2 postInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(postInfo, "postInfo");
        pj4.f2 f2Var = new pj4.f2();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 c17 = c();
        byte[] j17 = c17 != null ? c17.j("upload_cache_array") : null;
        if (j17 != null) {
            f2Var.mo11468x92b714fd(j17);
        }
        java.util.LinkedList infoArray = f2Var.f436577d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(infoArray, "infoArray");
        pm0.v.d0(infoArray, new oj4.i(postInfo));
        infoArray.add(postInfo);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 c18 = c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.UploadManager", "saveUploadTask size=" + infoArray.size() + ", result:" + (c18 != null ? java.lang.Boolean.valueOf(c18.H("upload_cache_array", f2Var.mo14344x5f01b1f6())) : null) + " info:" + a(postInfo));
    }
}
