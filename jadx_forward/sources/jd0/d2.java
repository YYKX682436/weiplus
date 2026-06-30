package jd0;

@j95.b
/* loaded from: classes12.dex */
public final class d2 extends i95.w implements kd0.s2 {
    public void Ai(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197 dealQBarStrEvent, int i17, r45.vm4 vm4Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dealQBarStrEvent, "dealQBarStrEvent");
        wi(dealQBarStrEvent);
        r45.bx5 bx5Var = dealQBarStrEvent.f135612g.f89328p.f453814d;
        bx5Var.f452665d = i17;
        bx5Var.f452668g = vm4Var;
    }

    public void Bi(android.content.Intent intent, com.p314xaae8f345.mm.p956x88360526.C11131x285e79f8 c11131x285e79f8) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        if (c11131x285e79f8 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanExtService", "fillScanCodeInfo scanCodeInfo null and ignore");
        } else {
            intent.putExtra("scanCodeInfo", c11131x285e79f8);
        }
    }

    public void Di(android.content.Intent intent, java.lang.String codeContent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codeContent, "codeContent");
        if (codeContent.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanExtService", "fillScanCodeInfo codeContent empty and ignore");
        } else {
            Bi(intent, new com.p314xaae8f345.mm.p956x88360526.C11131x285e79f8(codeContent, i17));
        }
    }

    public int Ni(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return 999;
        }
        if (r26.i0.y(str, "https://mp.weixin.qq.com/a/", false)) {
            return 2;
        }
        return (r26.i0.y(str, "mmec://", false) || r26.i0.y(str, "https://mp.weixin.qq.com/ec/", false)) ? 3 : 999;
    }

    public java.lang.String Ri(java.lang.String fileName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
        sb6.append(lp0.b.h0("scan").o());
        sb6.append('/');
        sb6.append(fileName);
        return sb6.toString();
    }

    public final void wi(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197 c5292x67f91197) {
        am.r3 r3Var = c5292x67f91197.f135612g;
        if (r3Var.f89328p == null) {
            r3Var.f89328p = new r45.db0();
        }
        r45.db0 db0Var = c5292x67f91197.f135612g.f89328p;
        if (db0Var.f453814d == null) {
            db0Var.f453814d = new r45.bx5();
        }
    }
}
