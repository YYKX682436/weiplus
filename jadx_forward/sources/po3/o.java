package po3;

/* loaded from: classes4.dex */
public class o extends com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j
    public boolean b(java.lang.String str, long j17) {
        if (p94.w0.e() != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2 f2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2) p94.w0.e();
            f2Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkIfExistByLocalId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            r0 = f2Var.i1((int) j17) != null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkIfExistByLocalId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        }
        return r0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j
    public java.util.ArrayList e(java.lang.Object obj) {
        java.util.ArrayList f17 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2) p94.w0.e()).f1();
        if (f17.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SendSnsFailNotification", "getAllFailMsgFromDb, resendList is empty");
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = f17.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(((java.lang.Long) it.next()).longValue(), ""));
        }
        return arrayList;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j
    public java.lang.String f(int i17) {
        return this.f233979d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.had, java.lang.Integer.valueOf(i17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j
    public long g(java.lang.Object obj) {
        return ((po3.g) obj).f438861a;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j
    public com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 h(java.lang.Object obj) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(((po3.g) obj).f438861a, "");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j
    public java.lang.String i(int i17, int i18, int i19) {
        android.content.Context context = this.f233979d;
        return i19 <= 0 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hbj, java.lang.Integer.valueOf(i18)) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hae, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j
    public java.lang.String j(int i17, int i18, int i19) {
        return this.f233979d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hbn, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j
    public java.lang.String k(int i17, int i18) {
        return this.f233979d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hbm, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j
    public int l() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j
    public void n(java.util.ArrayList arrayList) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5782x369224b5 c5782x369224b5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5782x369224b5();
        c5782x369224b5.f136093g.f88219a = arrayList;
        c5782x369224b5.e();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j
    public void o() {
        if (gm0.j1.a()) {
            c01.d9.b().p().w(589825, java.lang.Boolean.FALSE);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j
    public void p() {
        android.content.ComponentName componentName;
        android.content.Context context = this.f233979d;
        java.util.List<android.app.ActivityManager.RunningTaskInfo> runningTasks = ((android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getRunningTasks(1);
        if (runningTasks == null || runningTasks.size() <= 0 || (componentName = runningTasks.get(0).topActivity) == null || !componentName.getClassName().contains("SnsTimeLineUI")) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("sns_resume_state", false);
            intent.putExtra("sns_timeline_NeedFirstLoadint", true);
            intent.putExtra("preferred_tab", 2);
            intent.putExtra("From_fail_notify", true);
            intent.putExtra("jump_sns_from_notify", true);
            intent.addFlags(67108864);
            intent.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
            j45.l.u(context, "com.tencent.mm.ui.LauncherUI", intent, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j
    public void v(java.lang.String str, long j17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new po3.n(this, j17));
    }
}
