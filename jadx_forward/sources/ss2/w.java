package ss2;

/* loaded from: classes10.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ss2.a0 f493524d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ss2.a0 a0Var) {
        super(0);
        this.f493524d = a0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var;
        java.lang.String str;
        java.lang.String f17;
        com.p314xaae8f345.mm.vfs.x1 m17;
        ss2.a0 a0Var = this.f493524d;
        android.os.Bundle bundle = a0Var.A;
        com.p314xaae8f345.mm.vfs.z2 z2Var = null;
        java.util.ArrayList<java.lang.String> stringArrayList = bundle != null ? bundle.getStringArrayList("VIDEO_THUMB_LIST") : null;
        java.util.ArrayList arrayList = a0Var.f493450s;
        arrayList.clear();
        java.util.ArrayList arrayList2 = a0Var.f493444m;
        if (arrayList2 != null) {
            boolean z17 = false;
            int i17 = 0;
            for (java.lang.Object obj : arrayList2) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.lang.String str2 = (java.lang.String) obj;
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str2);
                java.lang.String str3 = a17.f294812f;
                if (str3 != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, z17, z17);
                    if (!str3.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, z2Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PostMediaWidget", "path %s video file size %d", str2, java.lang.Long.valueOf((m18.a() && (m17 = m18.f294799a.m(m18.f294800b)) != null) ? m17.f294766c : 0L));
                p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                if (stringArrayList == null || stringArrayList.size() <= i17 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringArrayList.get(i17))) {
                    mv2.q qVar = mv2.q.f413151a;
                    h0Var2.f391656d = qVar.k(str2, 4);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PostMediaWidget", "genVideoThumbFileTmp input:" + str2 + ", targetWidth:" + ((android.graphics.Point) h0Var2.f391656d).x + ", targetHeight:" + ((android.graphics.Point) h0Var2.f391656d).y);
                    android.graphics.Point point = (android.graphics.Point) h0Var2.f391656d;
                    h0Var = h0Var2;
                    str = "PostMediaWidget";
                    f17 = qVar.f(str2, point.x, point.y, null, "");
                } else {
                    h0Var2.f391656d = mv2.q.f413151a.k(str2, 2);
                    f17 = stringArrayList.get(i17);
                    h0Var = h0Var2;
                    str = "PostMediaWidget";
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17)) {
                    arrayList.add(f17);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new ss2.v(a0Var, str2, f17, h0Var));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "add thumb file, index:" + i17);
                }
                i17 = i18;
                z2Var = null;
                z17 = false;
            }
        }
        return jz5.f0.f384359a;
    }
}
