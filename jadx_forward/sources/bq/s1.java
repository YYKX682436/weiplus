package bq;

/* loaded from: classes.dex */
public final class s1 extends bq.e {
    public s1(int i17, java.lang.String str, java.lang.String str2, r45.xy6 xy6Var, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        super(null, 1, null);
        r45.ux2 ux2Var = new r45.ux2();
        ux2Var.set(2, java.lang.Integer.valueOf(i17));
        ux2Var.set(3, str);
        ux2Var.set(4, str2);
        ux2Var.set(5, xy6Var);
        ux2Var.set(6, str3);
        ux2Var.set(7, str4);
        ux2Var.set(8, str5);
        ux2Var.set(9, str6);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 25440;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findersubmitcreatortemplate";
        lVar.f152197a = ux2Var;
        lVar.f152198b = new r45.vx2();
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSubmitCreatorTemplateCGI", "init request: scene:" + i17 + " tplDescUrl:" + str + " tplDescMd5:" + str2 + " aigcTaskId:" + str3 + " parentTemplateId:" + str4 + " rootTemplateId:" + str5);
    }
}
