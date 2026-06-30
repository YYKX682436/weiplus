package df2;

/* loaded from: classes3.dex */
public final class k8 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f312091d;

    public k8(df2.s8 s8Var) {
        this.f312091d = s8Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Boolean bool;
        java.util.LinkedList m75941xfb821914;
        r45.nz3 nz3Var;
        java.util.LinkedList m75941xfb8219142;
        r45.nz3 nz3Var2;
        r45.e84 e84Var;
        df2.a9 a9Var;
        java.util.LinkedList m75941xfb8219143;
        java.lang.Object obj2;
        byte[] j17;
        df2.a9 a9Var2;
        java.util.LinkedList m75941xfb8219144;
        r45.nz3 nz3Var3;
        mm2.y0 y0Var = (mm2.y0) obj;
        if (y0Var.f411082b == 7) {
            df2.s8 s8Var = this.f312091d;
            s8Var.getClass();
            boolean z17 = false;
            java.lang.Integer[] numArr = {1, 2};
            r45.e84 e84Var2 = s8Var.f312840s;
            boolean G = kz5.z.G(numArr, (e84Var2 == null || (m75941xfb8219144 = e84Var2.m75941xfb821914(2)) == null || (nz3Var3 = (r45.nz3) kz5.n0.Z(m75941xfb8219144)) == null) ? null : java.lang.Integer.valueOf(nz3Var3.m75939xb282bd08(3)));
            r45.e84 e84Var3 = s8Var.f312840s;
            if (e84Var3 == null || (a9Var2 = (df2.a9) s8Var.m56789x25fe639c(df2.a9.class)) == null) {
                bool = null;
            } else {
                java.lang.String m75945x2fec8307 = e84Var3.m75945x2fec8307(5);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                bool = java.lang.Boolean.valueOf(a9Var2.Z6(m75945x2fec8307));
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click send fund gift result = ");
            qs5.m mVar = y0Var.f411081a;
            sb6.append(mVar);
            sb6.append(", isUvTask = ");
            sb6.append(G);
            sb6.append(", isTaskSend = ");
            sb6.append(bool);
            java.lang.String sb7 = sb6.toString();
            java.lang.String str = s8Var.f312832m;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
            if (mVar == qs5.m.f447971d) {
                if (G && (e84Var = s8Var.f312840s) != null && (a9Var = (df2.a9) s8Var.m56789x25fe639c(df2.a9.class)) != null) {
                    if (a9Var.f311227t == null) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a76 = a9Var.a7();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a76, "<get-mmkv>(...)");
                        java.lang.String str2 = a9Var.f311224q;
                        if (a76.f(str2) && (j17 = a76.j(str2)) != null) {
                            if (!(j17.length == 0)) {
                                try {
                                    java.lang.Object newInstance = r45.yb4.class.newInstance();
                                    ((com.p314xaae8f345.mm.p2495xc50a8b8b.f) newInstance).mo11468x92b714fd(j17);
                                    obj2 = (com.p314xaae8f345.mm.p2495xc50a8b8b.f) newInstance;
                                } catch (java.lang.Exception e17) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MultiProcessMMKV.decodeProtoBuffer", e17, "decode ProtoBuffer", new java.lang.Object[0]);
                                }
                                a9Var.f311227t = (r45.yb4) obj2;
                            }
                        }
                        obj2 = null;
                        a9Var.f311227t = (r45.yb4) obj2;
                    }
                    if (a9Var.f311227t == null) {
                        r45.yb4 yb4Var = new r45.yb4();
                        yb4Var.set(0, new java.util.LinkedList());
                        a9Var.f311227t = yb4Var;
                    }
                    r45.yb4 yb4Var2 = a9Var.f311227t;
                    if (yb4Var2 != null && (m75941xfb8219143 = yb4Var2.m75941xfb821914(0)) != null) {
                        r45.cd4 cd4Var = new r45.cd4();
                        cd4Var.set(1, e84Var.m75945x2fec8307(5));
                        cd4Var.set(0, java.lang.Integer.valueOf(e84Var.m75939xb282bd08(1)));
                        m75941xfb8219143.add(cd4Var);
                    }
                    ((ku5.t0) ku5.t0.f394148d).q(new df2.y8(false, a9Var));
                }
                r45.e84 e84Var4 = s8Var.f312840s;
                if (e84Var4 != null && (m75941xfb8219142 = e84Var4.m75941xfb821914(2)) != null && (nz3Var2 = (r45.nz3) kz5.n0.Z(m75941xfb8219142)) != null && nz3Var2.m75939xb282bd08(3) == 2) {
                    z17 = true;
                }
                if (!z17) {
                    s8Var.k7(2);
                }
                df2.a9 a9Var3 = (df2.a9) s8Var.m56789x25fe639c(df2.a9.class);
                if (a9Var3 != null) {
                    a9Var3.c7(c01.id.e());
                }
                if (!G || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.FALSE)) {
                    r45.e84 e84Var5 = s8Var.f312840s;
                    if (e84Var5 != null && (m75941xfb821914 = e84Var5.m75941xfb821914(2)) != null && (nz3Var = (r45.nz3) kz5.n0.Z(m75941xfb821914)) != null) {
                        nz3Var.set(2, java.lang.Integer.valueOf(nz3Var.m75939xb282bd08(2) + 1));
                        android.widget.TextView textView = s8Var.F;
                        if (textView != null) {
                            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                            sb8.append(nz3Var.m75939xb282bd08(2));
                            sb8.append(' ');
                            textView.setText(sb8.toString());
                        }
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "task already send, not plus local data");
                }
                df2.s8.Z6(s8Var, "onGiftSendInstantClick");
                df2.h7 h7Var = df2.h7.f311834d;
                df2.h7 h7Var2 = df2.h7.f311835e;
                if (kz5.z.G(new df2.h7[]{h7Var, h7Var2}, s8Var.B1)) {
                    s8Var.m7(h7Var2);
                }
            }
        }
    }
}
