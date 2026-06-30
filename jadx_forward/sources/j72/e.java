package j72;

/* loaded from: classes9.dex */
public final class e extends com.p314xaae8f345.mm.p944x882e457a.i {
    public e(java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        r45.rl5 rl5Var = new r45.rl5();
        rl5Var.f466514e = num != null ? num.intValue() : 0;
        rl5Var.f466515f = str == null ? "" : str;
        rl5Var.f466516g = str2 == null ? "" : str2;
        rl5Var.f466517h = str3 == null ? "" : str3;
        rl5Var.f466518i = str4 == null ? "" : str4;
        rl5Var.f466519m = str5 == null ? "" : str5;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneRecordExtraVideo", "[param] scene: " + rl5Var.f466514e + ", package_name: " + rl5Var.f466515f + ", package_sign: " + rl5Var.f466516g + ", serial_id: " + rl5Var.f466517h + ", video_id: " + rl5Var.f466518i + ", aes_key: " + rl5Var.f466519m);
        r45.sl5 sl5Var = new r45.sl5();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = rl5Var;
        lVar.f152198b = sl5Var;
        lVar.f152199c = "/cgi-bin/mmpay-bin/sec/recordextravideo";
        lVar.f152200d = 26256;
        lVar.f152211o = 2;
        p(lVar.a());
    }
}
