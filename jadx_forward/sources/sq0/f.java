package sq0;

@j95.b
/* loaded from: classes4.dex */
public final class f extends i95.w implements tq0.e {
    public tq0.f wi(java.lang.String instanceName, java.lang.String frameSetId) {
        uq0.e y07;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetId, "frameSetId");
        java.lang.String c17 = vq0.b.c(instanceName);
        if (!(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17, "MagicWxGameDynamicCard") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17, "MagicEcsKFDynamicCard"))) {
            return new tq0.f(null, 0, 3, null);
        }
        uq0.h hVar = (uq0.h) ((gq0.x) i95.n0.c(gq0.x.class));
        hVar.getClass();
        java.util.HashMap hashMap = hVar.f511734e;
        if (!hashMap.containsKey(c17.concat(frameSetId)) && (y07 = ((uq0.f) ((jz5.n) hVar.f511733d).mo141623x754a37bb()).y0(c17, frameSetId)) != null) {
            hashMap.put(c17.concat(frameSetId), y07);
        }
        uq0.e eVar = (uq0.e) hashMap.get(c17.concat(frameSetId));
        int i17 = eVar != null ? eVar.f65901x1c542321 : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicSclPlaceHolderService.SCL", "placeHolder, bizName: " + c17 + ", frameSetId: " + frameSetId + ", cachedHeight: " + i17);
        tq0.f fVar = new tq0.f(null, 0, 3, null);
        fVar.f502744b = i17;
        java.lang.String wi6 = ((qq0.m) ((qq0.i) i95.n0.c(qq0.i.class))).wi(c17, frameSetId);
        if (com.p314xaae8f345.mm.vfs.w6.j(wi6)) {
            fVar.f502743a = wi6;
        }
        return fVar;
    }
}
