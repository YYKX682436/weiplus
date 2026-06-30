package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public class zd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ae f165491e;

    public zd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ae aeVar, java.lang.String str) {
        this.f165491e = aeVar;
        this.f165490d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = this.f165490d;
        intent.putExtra("Retr_File_Name", str);
        intent.putExtra("Retr_Compress_Type", 0);
        intent.putExtra("Retr_Msg_Type", 0);
        intent.putExtra("from_scene_forward_to_wework", 6);
        intent.putExtra("content_type_forward_to_wework", 2);
        intent.putExtra("Select_Data_Send_To_WeWork", new com.p314xaae8f345.mm.p2610xe8058ca2.C21011xd572f9ed(str));
        j45.l.u(this.f165491e.f160311a.f163139c.getF229340d(), ".ui.transmit.MsgRetransmitUI", intent, null);
    }
}
