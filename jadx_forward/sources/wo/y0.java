package wo;

/* loaded from: classes14.dex */
public class y0 {
    public boolean a(java.lang.String str, wo.u uVar, wo.e eVar, wo.c cVar, wo.o oVar, wo.o1 o1Var, wo.x1 x1Var, wo.z0 z0Var, wo.h1 h1Var, wo.u1 u1Var, wo.g1 g1Var, wo.b bVar, wo.g1 g1Var2) {
        java.lang.String str2;
        java.lang.Exception exc;
        wo.c cVar2;
        wo.o oVar2;
        boolean z17;
        wo.x1 x1Var2;
        try {
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "deviceinfoconfig", null);
            try {
                if (d17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceInfoParser", "hy: null device config");
                    return false;
                }
                if (d17.get(".deviceinfoconfig.voip.cpu.armv7") != null) {
                    uVar.f529337b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.cpu.armv7"), 0);
                    uVar.f529336a = true;
                }
                if (d17.get(".deviceinfoconfig.voip.cpu.armv6") != null) {
                    uVar.f529338c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.cpu.armv6"), 0);
                    uVar.f529336a = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.num") != null) {
                    eVar.f529189a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.num"), 0);
                    eVar.f529190b = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.surface") != null) {
                    eVar.f529191c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.surface"), 0);
                    eVar.f529192d = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.format") != null) {
                    eVar.f529195g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.format"), 0);
                    eVar.f529196h = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.autofloatcamera") != null) {
                    eVar.f529193e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.autofloatcamera"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.manufloat") != null) {
                    eVar.f529194f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.manufloat"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.back.enable") != null) {
                    eVar.f529199k.f529176a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.back.enable"), 0);
                    eVar.f529200l = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.back.fps") != null) {
                    eVar.f529199k.f529177b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.back.fps"), 0);
                    eVar.f529200l = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.back.orien") != null) {
                    eVar.f529199k.f529178c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.back.orien"), 0);
                    eVar.f529200l = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.back.rotate") != null) {
                    eVar.f529199k.f529179d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.back.rotate"), 0);
                    eVar.f529200l = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.back.isleft") != null) {
                    eVar.f529199k.f529180e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.back.isleft"), 0);
                    eVar.f529200l = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.back.width") != null) {
                    eVar.f529199k.f529181f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.back.width"), 0);
                    eVar.f529200l = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.back.height") != null) {
                    eVar.f529199k.f529182g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.back.height"), 0);
                    eVar.f529200l = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.front.enable") != null) {
                    eVar.f529197i.f529176a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.front.enable"), 0);
                    eVar.f529198j = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.front.fps") != null) {
                    eVar.f529197i.f529177b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.front.fps"), 0);
                    eVar.f529198j = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.front.orien") != null) {
                    eVar.f529197i.f529178c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.front.orien"), 0);
                    eVar.f529198j = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.front.rotate") != null) {
                    eVar.f529197i.f529179d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.front.rotate"), 0);
                    eVar.f529198j = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.front.isleft") != null) {
                    eVar.f529197i.f529180e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.front.isleft"), 0);
                    eVar.f529198j = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.front.width") != null) {
                    eVar.f529197i.f529181f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.front.width"), 0);
                    eVar.f529198j = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.front.height") != null) {
                    eVar.f529197i.f529182g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.front.height"), 0);
                    eVar.f529198j = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.videorecord.frotate") != null) {
                    eVar.f529202n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.videorecord.frotate"), 0);
                    eVar.f529201m = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.videorecord.forientation") != null) {
                    eVar.f529203o = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.videorecord.forientation"), 0);
                    eVar.f529201m = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.videorecord.brotate") != null) {
                    eVar.f529204p = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.videorecord.brotate"), 0);
                    eVar.f529201m = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.videorecord.borientation") != null) {
                    eVar.f529205q = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.videorecord.borientation"), 0);
                    eVar.f529201m = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.videorecord.num") != null) {
                    eVar.f529206r = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.videorecord.num"), 0);
                    eVar.f529207s = true;
                    eVar.f529201m = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.videorecord.api20") != null) {
                    eVar.f529209u = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.videorecord.api20"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.setframerate") != null) {
                    eVar.f529208t = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.setframerate"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.scannerFocusThreshold") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.scannerFocusThreshold"), 0);
                    eVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.camera.scannerImageQuality") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.scannerImageQuality"), 0);
                    eVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.camera.autoFocusTimeInterval") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.autoFocusTimeInterval"), 0);
                    eVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.camera.focusType") != null) {
                    eVar.H = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.focusType"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.videorecord.num") != null) {
                    eVar.f529206r = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.videorecord.num"), 0);
                    eVar.f529207s = true;
                    eVar.f529201m = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.videorecord.api20") != null) {
                    eVar.f529209u = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.videorecord.api20"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.setframerate") != null) {
                    eVar.f529208t = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.setframerate"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.useFixFPSMode") != null) {
                    eVar.f529210v = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.useFixFPSMode"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.useRangeFPSMode") != null) {
                    eVar.f529211w = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.useRangeFPSMode"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.setYUV420SPFormat") != null) {
                    eVar.f529212x = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.setYUV420SPFormat"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.useMeteringMode") != null) {
                    eVar.f529213y = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.useMeteringMode"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.useContinueVideoFocusMode") != null) {
                    eVar.f529214z = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.useContinueVideoFocusMode"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.mUsestabilizationsupported") != null) {
                    eVar.A = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.mUsestabilizationsupported"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.sightCameraID") != null) {
                    eVar.B = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.sightCameraID"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.needEnhance") != null) {
                    eVar.C = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.needEnhance"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.support480enc") != null) {
                    eVar.D = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.support480enc"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.supportHWenc") != null) {
                    eVar.E = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.supportHWenc"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.voipBeauty") != null) {
                    eVar.I = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.voipBeauty"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.voipBeautyWhite") != null) {
                    eVar.f529188J = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.voipBeautyWhite"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.enable720cap") != null) {
                    eVar.F = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.enable720cap"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.mEnc720pCfg") != null) {
                    eVar.G = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.mEnc720pCfg"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.stFilter") != null) {
                    eVar.K = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.stFilter"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.stFilteroff") != null) {
                    eVar.L = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.stFilteroff"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.fpsMin") != null) {
                    eVar.M = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.fpsMin"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.fpsMax") != null) {
                    eVar.N = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.fpsMax"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.autoRotate") != null) {
                    eVar.O = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.autoRotate"), false);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.sharpenFilter") != null) {
                    eVar.P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.sharpenFilter"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.streamtype") != null) {
                    cVar2 = cVar;
                    cVar2.f529124b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.streamtype"), 0);
                    cVar2.f529122a = true;
                } else {
                    cVar2 = cVar;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.smode") != null) {
                    cVar2.f529126c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.smode"), 0);
                    cVar2.f529122a = true;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.omode") != null) {
                    cVar2.f529128d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.omode"), 0);
                    cVar2.f529122a = true;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.ospeaker") != null) {
                    cVar2.f529130e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.ospeaker"), 0);
                    cVar2.f529122a = true;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.operating") != null) {
                    cVar2.f529132f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.operating"), 0);
                    cVar2.f529122a = true;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.moperating") != null) {
                    cVar2.f529134g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.moperating"), 0);
                    cVar2.f529122a = true;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mstreamtype") != null) {
                    cVar2.f529136h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mstreamtype"), 0);
                    cVar2.f529122a = true;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.recordmode") != null) {
                    cVar2.f529138i = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.recordmode"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.playenddelay") != null) {
                    cVar2.f529140j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.playenddelay"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.aecmode") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.aecmode"), 0);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.nsmode") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.nsmode"), 0);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.volummode") != null) {
                    cVar2.f529142k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.volummode"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.sourcemode") != null) {
                    cVar2.A = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.sourcemode"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.micmode") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.micmode"), 0);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.speakerMode") != null) {
                    cVar2.B = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.speakerMode"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.phoneMode") != null) {
                    cVar2.C = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.phoneMode"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.deviceinfo.voipstreamType") != null) {
                    cVar2.D = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.deviceinfo.voipstreamType"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.speakerstreamtype") != null) {
                    cVar2.E = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.speakerstreamtype"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.phonestreamtype") != null) {
                    cVar2.F = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.phonestreamtype"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.ringphonestream") != null) {
                    cVar2.H = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.ringphonestream"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.ringphonemode") != null) {
                    cVar2.I = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.ringphonemode"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.ringspeakerstream") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.ringspeakerstream"), 0);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.ringspeakermode") != null) {
                    cVar2.f529121J = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.ringspeakermode"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.aecmodenew") != null) {
                    cVar2.K = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.aecmodenew"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.nsmodenew") != null) {
                    cVar2.L = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.nsmodenew"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.nsModeNewMulti") != null) {
                    cVar2.M = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.nsModeNewMulti"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.voipfullbandcfg") != null) {
                    cVar2.N = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.voipfullbandcfg"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.agcmodenew") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.agcmodenew"), 0);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.agcmode") != null) {
                    cVar2.O = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.agcmode"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.agctargetdb") != null) {
                    cVar2.P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.agctargetdb"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.agcgaindb") != null) {
                    cVar2.Q = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.agcgaindb"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.agcspkgaindb") != null) {
                    cVar2.T = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.agcspkgaindb"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.agcphngaindb") != null) {
                    cVar2.U = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.agcphngaindb"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.agchdsgaindb") != null) {
                    cVar2.V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.agchdsgaindb"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.playvolvoip") != null) {
                    cVar2.W = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.playvolvoip"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.playvolmt") != null) {
                    cVar2.X = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.playvolmt"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.agcflag") != null) {
                    cVar2.R = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.agcflag"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.agclimiter") != null) {
                    cVar2.S = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.agclimiter"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.agcCompRatio") != null) {
                    cVar2.Y = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.agcCompRatio"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.agcDnGainThr") != null) {
                    cVar2.Z = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.agcDnGainThr"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.waveAgcMode") != null) {
                    cVar2.f529123a0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.waveAgcMode"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.waveAgcSpkGain") != null) {
                    cVar2.f529125b0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.waveAgcSpkGain"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.waveAgcPhnGain") != null) {
                    cVar2.f529127c0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.waveAgcPhnGain"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.waveAgcHeadsetGain") != null) {
                    cVar2.f529129d0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.waveAgcHeadsetGain"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.waveAgcCRatio") != null) {
                    cVar2.f529133f0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.waveAgcCRatio"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.waveAgcDnTHR") != null) {
                    cVar2.f529135g0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.waveAgcDnTHR"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.waveAgcTarget") != null) {
                    cVar2.f529131e0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.waveAgcTarget"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.waveAgcBase") != null) {
                    cVar2.f529137h0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.waveAgcBase"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.waveAgcGainTHR") != null) {
                    cVar2.f529139i0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.waveAgcGainTHR"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.waveAgcDampTHR") != null) {
                    cVar2.f529141j0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.waveAgcDampTHR"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.waveAgcDamper") != null) {
                    cVar2.f529143k0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.waveAgcDamper"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.inputvolumescale") != null) {
                    cVar2.f529144l = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.inputvolumescale"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.outputvolumescale") != null) {
                    cVar2.f529146m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.outputvolumescale"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.inputvolumescaleforspeaker") != null) {
                    cVar2.f529148n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.inputvolumescaleforspeaker"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.outputvolumescaleforspeaker") != null) {
                    cVar2.f529150o = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.outputvolumescaleforspeaker"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.ehanceheadsetec") != null) {
                    cVar2.f529164v = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.ehanceheadsetec"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.setecmodelevelforheadset") != null) {
                    cVar2.f529166w = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.setecmodelevelforheadset"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.setecmodelevelforspeaker") != null) {
                    cVar2.f529168x = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.setecmodelevelforspeaker"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.enablespeakerenhanceec") != null) {
                    cVar2.f529170y = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.enablespeakerenhanceec"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.enablerectimer") != null) {
                    cVar2.f529145l0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.enablerectimer"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.enablePlayTimer") != null) {
                    cVar2.f529147m0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.enablePlayTimer"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.correctcof.cof0") != null) {
                    cVar2.f529151o0[0] = (short) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.correctcof.cof0"), 0);
                    cVar2.f529149n0 = 1;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.correctcof.cof1") != null) {
                    cVar2.f529151o0[1] = (short) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.correctcof.cof1"), 0);
                    cVar2.f529149n0 = 1;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.correctcof.cof2") != null) {
                    cVar2.f529151o0[2] = (short) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.correctcof.cof2"), 0);
                    cVar2.f529149n0 = 1;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.correctcof.cof3") != null) {
                    cVar2.f529151o0[3] = (short) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.correctcof.cof3"), 0);
                    cVar2.f529149n0 = 1;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.correctcof.cof4") != null) {
                    cVar2.f529151o0[4] = (short) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.correctcof.cof4"), 0);
                    cVar2.f529149n0 = 1;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.correctcof.cof5") != null) {
                    cVar2.f529151o0[5] = (short) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.correctcof.cof5"), 0);
                    cVar2.f529149n0 = 1;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.correctcof.cof6") != null) {
                    cVar2.f529151o0[6] = (short) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.correctcof.cof6"), 0);
                    cVar2.f529149n0 = 1;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.correctcof.cof7") != null) {
                    cVar2.f529151o0[7] = (short) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.correctcof.cof7"), 0);
                    cVar2.f529149n0 = 1;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.correctcof.cof8") != null) {
                    cVar2.f529151o0[8] = (short) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.correctcof.cof8"), 0);
                    cVar2.f529149n0 = 1;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.correctcof.cof9") != null) {
                    cVar2.f529151o0[9] = (short) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.correctcof.cof9"), 0);
                    cVar2.f529149n0 = 1;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.correctcof.cof10") != null) {
                    cVar2.f529151o0[10] = (short) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.correctcof.cof10"), 0);
                    cVar2.f529149n0 = 1;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.correctcof.cof11") != null) {
                    cVar2.f529151o0[11] = (short) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.correctcof.cof11"), 0);
                    cVar2.f529149n0 = 1;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.correctcof.cof12") != null) {
                    cVar2.f529151o0[12] = (short) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.correctcof.cof12"), 0);
                    cVar2.f529149n0 = 1;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.correctcof.cof13") != null) {
                    cVar2.f529151o0[13] = (short) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.correctcof.cof13"), 0);
                    cVar2.f529149n0 = 1;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.correctcof.cof14") != null) {
                    cVar2.f529151o0[14] = (short) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.correctcof.cof14"), 0);
                    cVar2.f529149n0 = 1;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.correctoff") != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.correctoff"), 0) == 1) {
                    cVar2.f529149n0 = 0;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.outputvolumegainforphone") != null) {
                    cVar2.f529152p = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.outputvolumegainforphone"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.outputvolumegainforspeaker") != null) {
                    cVar2.f529154q = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.outputvolumegainforspeaker"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.noisegatestrength.cof0") != null) {
                    cVar2.f529153p0[0] = (short) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.noisegatestrength.cof0"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.noisegatestrength.cof1") != null) {
                    cVar2.f529153p0[1] = (short) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.noisegatestrength.cof1"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.agcrxflag") != null) {
                    cVar2.f529171y0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.agcrxflag"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.agcrxtargetdb") != null) {
                    cVar2.f529173z0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.agcrxtargetdb"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.agcrxgaindb") != null) {
                    cVar2.A0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.agcrxgaindb"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.agcrxlimiter") != null) {
                    cVar2.B0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.agcrxlimiter"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.spkecenable") != null) {
                    cVar2.f529155q0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.spkecenable"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.enableXnoiseSup") != null) {
                    cVar2.f529172z = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.enableXnoiseSup"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.playenddelay") != null) {
                    cVar2.f529140j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.playenddelay"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dFlag") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dFlag"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dAzim1") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dAzim1"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dAzim2") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dAzim2"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dAzim3") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dAzim3"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dAzim4") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dAzim4"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dAzim5") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dAzim5"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dAzim6") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dAzim6"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dAzim7") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dAzim7"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dAzim8") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dAzim8"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dElvl1") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dElvl1"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dElvl2") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dElvl2"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dElvl3") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dElvl3"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dElvl4") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dElvl4"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dElvl5") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dElvl5"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dElvl6") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dElvl6"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dElvl7") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dElvl7"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dElvl8") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dElvl8"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.forbiddenUseSco") != null) {
                    cVar2.f529156r = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.forbidSco"), -1);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.audioForbiddenStrategy") != null) {
                    cVar2.f529158s = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.audioForbiddenStrategy"), -1);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.audioForbiddenRefreshTime") != null) {
                    cVar2.f529160t = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.audioForbiddenRefreshTime"), -1);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.audioForbiddenRequestTimes") != null) {
                    cVar2.f529162u = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.audioForbiddenRequestTimes"), -1);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dPhi") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dPhi"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dTheta1") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dTheta1"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dTheta2") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dTheta2"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.ipcall.speakermode") != null) {
                    cVar2.f529159s0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.ipcall.speakermode"), 0);
                    cVar2.f529157r0 = true;
                }
                if (d17.get(".deviceinfoconfig.voip.ipcall.phonemode") != null) {
                    cVar2.f529161t0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.ipcall.phonemode"), 0);
                    cVar2.f529157r0 = true;
                }
                if (d17.get(".deviceinfoconfig.voip.ipcall.sourcemode") != null) {
                    cVar2.f529163u0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.ipcall.sourcemode"), 0);
                    cVar2.f529157r0 = true;
                }
                if (d17.get(".deviceinfoconfig.voip.ipcall.streamtype") != null) {
                    cVar2.f529165v0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.ipcall.streamtype"), 0);
                    cVar2.f529157r0 = true;
                }
                if (d17.get(".deviceinfoconfig.voip.ipcall.speakerstreamtype") != null) {
                    cVar2.f529167w0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.ipcall.speakerstreamtype"), 0);
                    cVar2.f529157r0 = true;
                }
                if (d17.get(".deviceinfoconfig.voip.ipcall.phonestreamtype") != null) {
                    cVar2.f529169x0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.ipcall.phonestreamtype"), 0);
                    cVar2.f529157r0 = true;
                }
                if (d17.get(".deviceinfoconfig.voip.common.js") != null) {
                    oVar.getClass();
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.js"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.js") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.js"), 0);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.stopbluetoothbr") != null) {
                    oVar2 = oVar;
                    oVar2.f529276a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.stopbluetoothbr"), 0);
                } else {
                    oVar2 = oVar;
                }
                if (d17.get(".deviceinfoconfig.voip.common.stopbluetoothbu") != null) {
                    oVar2.f529277b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.stopbluetoothbu"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.setbluetoothscoon") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.setbluetoothscoon"), 0);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.startbluetoothsco") != null) {
                    oVar2.f529278c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.startbluetoothsco"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.voicesearchfastmode") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.voicesearchfastmode"), 0);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.pcmreadmode") != null) {
                    oVar2.f529280e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.pcmreadmode"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.pcmbufferrate") != null) {
                    oVar2.f529279d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.pcmbufferrate"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.app") != null) {
                    oVar2.f529281f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.app"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.deviceinfo.voipapp") != null) {
                    oVar2.f529293r = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.deviceinfo.voipapp"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.deviceinfo.voipappns") != null) {
                    oVar2.f529294s = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.deviceinfo.voipappns"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.deviceinfo.voipappaec") != null) {
                    oVar2.f529295t = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.deviceinfo.voipappaec"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.deviceinfo.voipappagc") != null) {
                    oVar2.f529296u = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.deviceinfo.voipappagc"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.voipnewrenderer") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.voipnewrenderer"), 0);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.voipUseRemovePreviewCallback") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.voipUseRemovePreviewCallback"), 0);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.voipForceUseEncodeMode") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.voipForceUseEncodeMode"), 0);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.voipFaceBeautyUseHighRank") != null) {
                    oVar2.f529300y = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.voipFaceBeautyUseHighRank"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.voipUseCameraApi2") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.voipUseCameraApi2"), 0);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.voipUseNewCameraModular") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.voipUseNewCameraModular"), 0);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.voipgpurgb2yuv") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.voipgpurgb2yuv"), 0);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.voipgpucrop") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.voipgpucrop"), 0);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.groupRs") != null) {
                    oVar2.f529292q = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.groupRs"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.vmfd") != null) {
                    oVar2.f529282g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.vmfd"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.htcvoicemode") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.htcvoicemode"), 0);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.samsungvoicemode") != null) {
                    oVar2.f529283h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.samsungvoicemode"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.speexbufferrate") != null) {
                    oVar2.f529284i = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.speexbufferrate"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.linespe") != null) {
                    oVar2.f529285j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.linespe"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.fixspan") != null) {
                    oVar2.f529291p = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.fixspan"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.extvideo") != null) {
                    oVar2.f529286k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.extvideo"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.extvideosam") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.extvideosam"), 0);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.sysvideodegree") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.sysvideodegree"), 0);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.mmnotify") != null) {
                    oVar2.f529288m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.mmnotify"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.extsharevcard") != null) {
                    oVar2.f529287l = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.extsharevcard"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.audioformat") != null) {
                    oVar2.f529289n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.audioformat"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.qrcam") != null) {
                    oVar2.f529290o = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.qrcam"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.sysvideofdegree") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.sysvideofdegree"), 0);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.audioformat") != null) {
                    oVar2.f529289n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.audioformat"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.qrcam") != null) {
                    oVar2.f529290o = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.qrcam"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.base") != null) {
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.packageinfo") != null) {
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.classloader") != null) {
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.resources") != null) {
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.sysvideofp") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.sysvideofp"), 0);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.extstoragedir") != null) {
                    oVar2.f529301z = (java.lang.String) d17.get(".deviceinfoconfig.voip.common.extstoragedir");
                }
                if (d17.get(".deviceinfoconfig.voip.common.extpubdir") != null) {
                    oVar2.A = (java.lang.String) d17.get(".deviceinfoconfig.voip.common.extpubdir");
                }
                if (d17.get(".deviceinfoconfig.voip.common.extdatadir") != null) {
                    oVar2.B = (java.lang.String) d17.get(".deviceinfoconfig.voip.common.extdatadir");
                }
                if (d17.get(".deviceinfoconfig.voip.common.extrootdir") != null) {
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.extstoragestate") != null) {
                    oVar2.C = (java.lang.String) d17.get(".deviceinfoconfig.voip.common.extstoragestate");
                }
                if (d17.get(".deviceinfoconfig.voip.common.extcachedir") != null) {
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.extvideoplayer") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.extvideoplayer"), -1);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.loadDrawable") != null) {
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.loadXmlResourceParser") != null) {
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.sensorNearFar") != null && 1 == com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.sensorNearFar"), 0)) {
                    int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716.f273961p;
                }
                if (d17.get(".deviceinfoconfig.voip.common.sensorNearFarDivideRatio") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716.f273960o = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F((java.lang.String) d17.get(".deviceinfoconfig.voip.common.sensorNearFarDivideRatio"), 0.0d);
                }
                if (d17.get(".deviceinfoconfig.voip.common.sightFullType") != null) {
                    oVar2.D = (java.lang.String) d17.get(".deviceinfoconfig.voip.common.sightFullType");
                }
                if (d17.get(".deviceinfoconfig.voip.common.slyTextureView") != null) {
                    oVar2.E = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.slyTextureView"), -1);
                }
                if (d17.get(".deviceinfoconfig.voip.common.checkSightDraftMd5") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.checkSightDraftMd5"), 1);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.swipeBackConfig") != null) {
                    int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.swipeBackConfig"), 1);
                    oVar.getClass();
                    ep.a.b(P == 1);
                }
                if (d17.get(".deviceinfoconfig.voip.common.canDecodeWebp") != null) {
                    oVar2.F = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.canDecodeWebp"), 1);
                }
                if (d17.get(".deviceinfoconfig.voip.common.isScanZoom") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.isScanZoom"), -1);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.scanMaxZoomDivideRatio") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F((java.lang.String) d17.get(".deviceinfoconfig.voip.common.scanMaxZoomDivideRatio"), -1.0d);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.notificationSetMode") != null) {
                    oVar2.G = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.notificationSetMode"), -1);
                }
                if (d17.get(".deviceinfoconfig.voip.common.hevcTransCodeMediaCodec") != null) {
                    oVar2.H = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.hevcTransCodeMediaCodec"), -1);
                }
                if (d17.get(".deviceinfoconfig.voip.common.videoSupportHevcDecode") != null) {
                    oVar2.I = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.videoSupportHevcDecode"), -1);
                }
                if (d17.get(".deviceinfoconfig.voip.common.checkOnPauseWindowsFocus") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.checkOnPauseWindowsFocus"), 1);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.vcodec1MaxEncRes") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.vcodec1MaxEncRes"), -1);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.vcodec2MaxEncRes") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.vcodec2MaxEncRes"), -1);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.hw264MaxEncRes") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.hw264MaxEncRes"), -1);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.hw265MaxEncRes") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.hw265MaxEncRes"), -1);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.vcodec1MixMaxEncRes") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.vcodec1MixMaxEncRes"), -1);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.vcodec1MaxDecRes") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.vcodec1MaxDecRes"), -1);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.vcodec2MaxDecRes") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.vcodec2MaxDecRes"), -1);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.hw264MaxDecRes") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.hw264MaxDecRes"), -1);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.hw265MaxDecRes") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.hw265MaxDecRes"), -1);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.vcodec1MaxDecRes") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.vcodec1MixMaxDecRes"), -1);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.mediaRecorder.useThisInfo") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.mediaRecorder.useThisInfo"), 0);
                    o1Var.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.mediaRecorder.width") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.mediaRecorder.width"), 0);
                    o1Var.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.mediaRecorder.height") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.mediaRecorder.height"), 0);
                    o1Var.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.mediaRecorder.frameRate") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.mediaRecorder.frameRate"), 0);
                    o1Var.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.mediaRecorder.encodingBitRate") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.mediaRecorder.encodingBitRate"), 0);
                    o1Var.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.mediaRecorder.useSystem") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.mediaRecorder.useSystem"), 0);
                    o1Var.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.mediaRecorder.yuv420SPSeek") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.mediaRecorder.yuv420SPSeek"), 0);
                    o1Var.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.mediaRecorder.useMediaCodecEncodeAAC") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.mediaRecorder.useMediaCodecEncodeAAC"), 0);
                    o1Var.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.mediaRecorder.AACSampleRate") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.mediaRecorder.AACSampleRate"), 0);
                    o1Var.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.mediaRecorder.useTextureViewForCamera") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.mediaRecorder.useTextureViewForCamera"), 0);
                    o1Var.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.mediaRecorder.useFDWithFileSize") != null) {
                    o1Var.f529303a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.mediaRecorder.useFDWithFileSize"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.webview.notifythread") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.webview.notifythread"), 0);
                    x1Var.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.webview.forceUseSysWebView") != null) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.webview.forceUseSysWebView"), 0) == 1) {
                        x1Var2 = x1Var;
                        z17 = true;
                    } else {
                        z17 = false;
                        x1Var2 = x1Var;
                    }
                    x1Var2.f529399a = z17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceInfoParser", "save forceusesystemwebview = %b", java.lang.Boolean.valueOf(z17));
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.b().getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4).edit().putBoolean("tbs_force_user_sys_webview", x1Var2.f529399a).commit();
                }
                oVar.a();
                int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.fingerprint.forceFingerprintStatus"), 0);
                int P3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.fingerprint.supportExportEntrance"), 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceInfoParser", "hy: got fingerprint force status: %d", java.lang.Integer.valueOf(P2));
                if (z0Var != null) {
                    z0Var.b(P2);
                    z0Var.a(P3);
                }
                int P4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.soter.isSupport"), 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceInfoParser", "hy: get soter status: %d", java.lang.Integer.valueOf(P4));
                if (u1Var != null) {
                    u1Var.b(P4 >= 1);
                    u1Var.a(P4);
                }
                if (P2 == 11 && P3 == 11 && u1Var != null) {
                    z0Var.b(1);
                    z0Var.a(1);
                    u1Var.b(true);
                    u1Var.a(1);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceInfoParser", "py: hw patch is available now!");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceInfoParser", "lm: got PublicNum: %s", (java.lang.String) d17.get(".deviceinfoconfig.freeWifi.operations.bizUserName"));
                java.util.Map d18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "manufacturerName", null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceInfoParser", "lm: got manufacturerNameMaps: %s", d18);
                if (h1Var != null) {
                    h1Var.a(d18);
                }
                int P5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.style.swipback"), 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceInfoParser", "lm: got swipback: %d", java.lang.Integer.valueOf(P5));
                if (h1Var != null) {
                    h1Var.b(P5);
                }
                int P6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.game.isLimit"), 0);
                java.lang.String str3 = (java.lang.String) d17.get(".deviceinfoconfig.game.limitPrompt");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceInfoParser", "lm: get game status: %d,gamePrompt:%s", java.lang.Integer.valueOf(P6), str3);
                if (bVar != null) {
                    bVar.a(P6 == 1);
                    bVar.b(str3);
                }
                if (d17.get(".deviceinfoconfig.appbrand.enableV8Lite") != null) {
                    wo.a.f529118a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y((java.lang.String) d17.get(".deviceinfoconfig.appbrand.enableV8Lite"), false);
                }
                if (d17.get(".deviceinfoconfig.debug.multitalkSdkApply") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.debug.multitalkSdkApply"), 0);
                }
                if (d17.get(".deviceinfoconfig.debug.screenPcCastDebug") != null) {
                    oVar2.f529297v = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.debug.screenPcCastDebug"), 0);
                }
                if (d17.get(".deviceinfoconfig.debug.screenPcCastUseAsyncCodec") != null) {
                    oVar2.f529298w = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.debug.screenPcCastUseAsyncCodec"), 0);
                }
                if (d17.get(".deviceinfoconfig.debug.screenCast2PcRenderUseAsyncCodec") != null) {
                    oVar2.f529299x = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.debug.screenCast2PcRenderUseAsyncCodec"), 0);
                }
                if (d17.get(".deviceinfoconfig.debug.screenCast2PcDebugIgnoreScan") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.debug.screenCast2PcDebugIgnoreScan"), 0);
                }
                if (d17.get(".deviceinfoconfig.debug.blackBoardProjectDebug") != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.debug.blackBoardProjectDebug"), 0);
                }
                int P7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.recordertype"), -1);
                int P8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.needRotateEachFrame"), -1);
                int P9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.enableHighResolutionRecord"), -1);
                int P10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.landscapeRecordModeEnable"), -1);
                int P11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.transcodeDecoderType"), -1);
                int P12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.mediaPlayerType"), -1);
                int P13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.strategyMask"), -1);
                int P14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.recorderOption"), -1);
                int P15 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.useMetering"), -1);
                int P16 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.transcodeEncoderType"), -1);
                int P17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.checkSendVideoBitrate"), -1);
                int P18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.cpuCrop"), -1);
                int P19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.storyRecorderType"), -1);
                int P20 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.backgroundRemux"), -1);
                int P21 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.emojiPreviewSize"), -1);
                try {
                    int P22 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.emojiStickerSampleSize"), -1);
                    int P23 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.emojiUseSmallModel"), -1);
                    int P24 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.emojiUseGpuSegment"), -1);
                    int P25 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.c2cRemuxUseSoftEncode"), -1);
                    int P26 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.snsRemuxUseSoftEncode"), -1);
                    int P27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.takePhotoAlignType"), -1);
                    int P28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.nativeToThumb"), -1);
                    int P29 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.HWQPCfg"), -1);
                    int P30 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.useCameraApi2"), -1);
                    int P31 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.fullFuncApi2"), -1);
                    int P32 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.camera2UseRecordStream"), -1);
                    int P33 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.vendorCameraEffectSupported"), -1);
                    int P34 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.useImageStreamCapture"), -1);
                    int P35 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.useRenderScriptCropImage"), -1);
                    int P36 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.isVendorDebugModeSupported"), -1);
                    int P37 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.captureHwHevcEncodeEnable"), -1);
                    int P38 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.captureSwHevcEncodeEnable"), -1);
                    int P39 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.remuxHwHevcEncodeEnable"), -1);
                    int P40 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.remuxSwHevcEncodeEnable"), -1);
                    if (g1Var != null) {
                        g1Var.f529220a = P7;
                        g1Var.f529221b = P8;
                        g1Var.f529222c = P9;
                        g1Var.f529223d = P10;
                        g1Var.f529224e = P11;
                        g1Var.f529225f = P12;
                        g1Var.f529226g = P13;
                        g1Var.f529227h = P14;
                        g1Var.f529228i = P15;
                        g1Var.f529229j = P16;
                        g1Var.f529230k = P17;
                        g1Var.f529233n = P21;
                        g1Var.f529234o = P22;
                        g1Var.f529235p = P23;
                        g1Var.f529236q = P24;
                        g1Var.f529244y = P25;
                        g1Var.f529245z = P26;
                        g1Var.B = P27;
                        g1Var.C = P28;
                        g1Var.A = P29;
                        g1Var.f529237r = P30;
                        g1Var.f529239t = P31;
                        g1Var.f529238s = P32;
                        g1Var.f529240u = P33;
                        g1Var.f529241v = P34;
                        g1Var.f529242w = P35;
                        g1Var.f529243x = P36;
                        g1Var.D = P37;
                        g1Var.E = P38;
                        g1Var.F = P39;
                        g1Var.G = P40;
                        str2 = "MicroMsg.DeviceInfoParser";
                        try {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "get mmSightRecorderInfo: %s", g1Var.m174192x9616526c());
                        } catch (java.lang.Exception e17) {
                            e = e17;
                            exc = e;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str2, exc, "", new java.lang.Object[0]);
                            return false;
                        }
                    } else {
                        str2 = "MicroMsg.DeviceInfoParser";
                    }
                    if (g1Var2 == null) {
                        return true;
                    }
                    g1Var2.f529220a = P19;
                    g1Var2.f529221b = P8;
                    g1Var2.f529222c = P9;
                    g1Var2.f529223d = P10;
                    g1Var2.f529224e = P11;
                    g1Var2.f529225f = P12;
                    g1Var2.f529226g = P13;
                    g1Var2.f529227h = P14;
                    g1Var2.f529228i = P15;
                    g1Var2.f529229j = P16;
                    g1Var2.f529230k = P17;
                    g1Var2.f529231l = P18;
                    g1Var2.f529232m = P20;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "get mmStoryRecorderInfo: %s", g1Var2.m174192x9616526c());
                    return true;
                } catch (java.lang.Exception e18) {
                    e = e18;
                    str2 = "MicroMsg.DeviceInfoParser";
                }
            } catch (java.lang.Exception e19) {
                exc = e19;
                str2 = "MicroMsg.DeviceInfoParser";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str2, exc, "", new java.lang.Object[0]);
                return false;
            }
        } catch (java.lang.Exception e27) {
            e = e27;
            str2 = "MicroMsg.DeviceInfoParser";
        }
    }
}
