package wb;

/* loaded from: classes11.dex */
public final class j extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wb.i f525880a;

    public j(wb.i iVar) {
        this.f525880a = iVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int i17 = message.what;
        wb.i iVar = this.f525880a;
        if (i17 == 100) {
            int i18 = message.getData().getInt(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993);
            ((y62.e) iVar.f525878a).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "localVoiceControl onGetError:%s", java.lang.Integer.valueOf(i18));
            return;
        }
        if (i17 != 200) {
            return;
        }
        wb.a aVar = (wb.a) message.obj;
        y62.e eVar = (y62.e) iVar.f525878a;
        eVar.getClass();
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ext.ExtControlProviderVoiceControl", "localVoiceControl onGetResult restult is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.ext.p1401xd83027eb.C13508xbccd9e98 c13508xbccd9e98 = eVar.f541167a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "localVoiceControl use time2:%s,text: %s,name: %s", java.lang.Long.valueOf(currentTimeMillis - c13508xbccd9e98.f181461w), aVar.f525860a, aVar.f525861b);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f525861b)) {
            return;
        }
        c13508xbccd9e98.f181462x = true;
        c13508xbccd9e98.o(aVar.f525861b);
    }
}
