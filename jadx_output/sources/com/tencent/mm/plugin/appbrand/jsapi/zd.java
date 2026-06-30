package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class zd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.ae f83958e;

    public zd(com.tencent.mm.plugin.appbrand.jsapi.ae aeVar, java.lang.String str) {
        this.f83958e = aeVar;
        this.f83957d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = this.f83957d;
        intent.putExtra("Retr_File_Name", str);
        intent.putExtra("Retr_Compress_Type", 0);
        intent.putExtra("Retr_Msg_Type", 0);
        intent.putExtra("from_scene_forward_to_wework", 6);
        intent.putExtra("content_type_forward_to_wework", 2);
        intent.putExtra("Select_Data_Send_To_WeWork", new com.tencent.mm.sendtowework.ImgData(str));
        j45.l.u(this.f83958e.f78778a.f81606c.getF147807d(), ".ui.transmit.MsgRetransmitUI", intent, null);
    }
}
