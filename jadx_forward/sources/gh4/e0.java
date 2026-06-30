package gh4;

@j95.b
/* loaded from: classes8.dex */
public final class e0 extends i95.w implements gh4.s, p012xc85e97e9.p093xedfae76a.m1 {

    /* renamed from: d, reason: collision with root package name */
    public gh4.o0 f353452d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.l1 f353453e = new p012xc85e97e9.p093xedfae76a.l1();

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c Ai(java.lang.String id6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        gh4.o0 Bi = Bi();
        if (Bi != null) {
            return Bi.y0(id6);
        }
        return null;
    }

    public final gh4.o0 Bi() {
        if (this.f353452d == null && gm0.j1.a()) {
            synchronized (this) {
                if (this.f353452d == null) {
                    l75.k0 k0Var = gm0.j1.u().f354686f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k0Var, "getDataDB(...)");
                    this.f353452d = new gh4.o0(k0Var);
                }
            }
        }
        return this.f353452d;
    }

    public java.util.List Di(int i17) {
        gh4.o0 Bi = Bi();
        if (Bi == null) {
            return new java.util.ArrayList();
        }
        android.database.Cursor B = Bi.f353479d.B("SELECT * FROM TaskBarInfo WHERE type = ? ORDER BY updateTime DESC;", new java.lang.String[]{java.lang.String.valueOf(i17)});
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (B.moveToNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c();
            c16601x7ed0e40c.mo9015xbf5d97fd(B);
            arrayList.add(c16601x7ed0e40c);
        }
        B.close();
        return arrayList;
    }

    public final void Ni(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c multiTaskInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(multiTaskInfo, "multiTaskInfo");
        gh4.s0 s0Var = (gh4.s0) i95.n0.c(gh4.s0.class);
        s0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewService", "notifyRemoveTaskBarItem " + multiTaskInfo.v0().m75945x2fec8307(1) + ' ' + multiTaskInfo.f66791xc8a07680 + ' ' + multiTaskInfo.f66793x2262335f);
        java.util.HashSet hashSet = (java.util.HashSet) s0Var.f353487d.get(multiTaskInfo.f66793x2262335f);
        if (hashSet != null) {
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((hh4.k) it.next()).p0(multiTaskInfo);
            }
        }
        fs.g.c(hh4.j.class, java.lang.Integer.valueOf(multiTaskInfo.f66793x2262335f), new gh4.r0(multiTaskInfo));
    }

    public final void Ri(java.lang.String str) {
        if (str != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str2 = gh4.m0.f353472a;
            sb6.append(gh4.m0.f353473b);
            sb6.append(str);
            java.lang.String sb7 = sb6.toString();
            if (com.p314xaae8f345.mm.vfs.w6.j(sb7)) {
                com.p314xaae8f345.mm.vfs.w6.h(sb7);
            }
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            java.lang.String str3 = gh4.m0.f353472a;
            sb8.append(gh4.m0.f353472a);
            sb8.append(str);
            java.lang.String sb9 = sb8.toString();
            if (com.p314xaae8f345.mm.vfs.w6.j(sb9)) {
                com.p314xaae8f345.mm.vfs.w6.h(sb9);
            }
        }
    }

    public void Ui(java.lang.String str, boolean z17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c y07;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBar.PluginTaskBar", "removeTaskInfo " + str + ' ' + z17 + ' ' + i17);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(dm.i4.f66865x76d1ec5a, str);
            bundle.putInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, i17);
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, gh4.b.class, gh4.y.f353501d);
            return;
        }
        if (gm0.j1.a() && str != null) {
            Ri(str);
            gh4.o0 Bi = Bi();
            if (Bi == null || (y07 = Bi.y0(str)) == null) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarStorage", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55714x23574fe5 + y07.f66793x2262335f + ' ' + y07.f66791xc8a07680 + ' ' + y07.v0().m75945x2fec8307(1) + ' ' + i17);
            Bi.mo49766xb06685ab((l75.f0) y07, false, new java.lang.String[0]);
            if (z17) {
                gh4.n0 n0Var = new gh4.n0();
                n0Var.f353476a = y07;
                n0Var.f353477b = i17;
                Bi.mo142179xf35bbb4("single", 5, n0Var);
            }
        }
    }

    public final void Vi(android.graphics.Bitmap bitmap, java.lang.String str, yz5.a aVar) {
        ((ku5.t0) ku5.t0.f394148d).q(new gh4.z(bitmap, str, aVar));
    }

    public final void Zi(java.lang.String id6, int i17, r45.lr4 lr4Var, byte[] bArr, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c Ai = Ai(id6);
        if (Ai != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBar.PluginTaskBar", "updateTaskInfo id:" + id6 + " type:" + i17 + " updateBitmapOnly:" + z17);
            Ai.f66794xa783a79b = java.lang.System.currentTimeMillis();
            if (!z17) {
                Ai.f66792x98981ec = lr4Var;
                if (bArr != null) {
                    Ai.f66790x225a93cf = bArr;
                }
            }
            gh4.o0 Bi = Bi();
            if (Bi != null) {
                Bi.mo9952xce0038c9(Ai, new java.lang.String[0]);
            }
        }
    }

    @Override // p012xc85e97e9.p093xedfae76a.m1
    /* renamed from: getViewModelStore */
    public p012xc85e97e9.p093xedfae76a.l1 getViewModel() {
        return this.f353453e;
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBar.PluginTaskBar", "onAccountRelease");
        this.f353452d = null;
    }

    public final void wi(java.lang.String id6, int i17, r45.lr4 lr4Var, byte[] bArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c Ai = Ai(id6);
        if (Ai != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBar.PluginTaskBar", "updateTaskInfo id:" + id6 + " type:" + i17);
            Ai.f66794xa783a79b = java.lang.System.currentTimeMillis();
            Ai.f66792x98981ec = lr4Var;
            if (bArr != null) {
                Ai.f66790x225a93cf = bArr;
            }
            gh4.o0 Bi = Bi();
            if ((Bi != null ? java.lang.Boolean.valueOf(Bi.mo9952xce0038c9(Ai, new java.lang.String[0])) : null) != null) {
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBar.PluginTaskBar", "addTaskInfo id:" + id6 + " type:" + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c();
        c16601x7ed0e40c.f66791xc8a07680 = id6;
        c16601x7ed0e40c.f66793x2262335f = i17;
        c16601x7ed0e40c.f66789xac3be4e = java.lang.System.currentTimeMillis();
        c16601x7ed0e40c.f66794xa783a79b = java.lang.System.currentTimeMillis();
        c16601x7ed0e40c.f66792x98981ec = lr4Var;
        c16601x7ed0e40c.f66790x225a93cf = bArr;
        gh4.o0 Bi2 = Bi();
        if (Bi2 != null) {
            Bi2.mo880xb970c2b9(c16601x7ed0e40c);
        }
    }
}
