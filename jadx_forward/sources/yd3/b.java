package yd3;

/* loaded from: classes15.dex */
public final class b extends xd3.d {
    @Override // xd3.a
    public boolean a(ve3.u action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        return action == ve3.u.f517642h;
    }

    @Override // xd3.d
    public void b(ve3.r service, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16467x9eb59478 data, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        super.b(service, data, rVar);
        android.os.Parcelable parcelable = data.f229699h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parcelable, "null cannot be cast to non-null type com.tencent.mm.ipcinvoker.type.IPCString");
        java.lang.String str = ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) parcelable).f149939d;
        xd3.c cVar = new xd3.c(rVar);
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "startPlay");
        int i17 = data.f229696e;
        if (b17) {
            service.R7(i17, cVar);
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "stopPlay")) {
            service.r4(i17, cVar);
        }
    }

    @Override // xd3.d
    public void d(ve3.s service, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16467x9eb59478 data, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        super.d(service, data, rVar);
        android.os.Parcelable parcelable = data.f229699h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parcelable, "null cannot be cast to non-null type com.tencent.mm.ipcinvoker.type.IPCString");
        java.lang.String str = ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) parcelable).f149939d;
        xd3.c cVar = new xd3.c(rVar);
        if (str != null) {
            int hashCode = str.hashCode();
            java.lang.String str2 = data.f229698g;
            int i18 = data.f229696e;
            switch (hashCode) {
                case -934426579:
                    if (str.equals("resume")) {
                        ((xe3.p) service).Ai(i18, cVar, new xe3.j(cVar), "resumePlay failed");
                        return;
                    }
                    return;
                case 3327652:
                    if (str.equals("loop") && str2 != null) {
                        ((xe3.p) service).Ai(i18, cVar, new xe3.l(new org.json.JSONObject(str2).getBoolean("enableLoop"), cVar), "setLoop failed");
                        return;
                    }
                    return;
                case 3363353:
                    if (str.equals("mute") && str2 != null) {
                        ((xe3.p) service).Ai(i18, cVar, new xe3.m(new org.json.JSONObject(str2).getBoolean("enableMute"), cVar), "setMute failed");
                        return;
                    }
                    return;
                case 3526264:
                    if (str.equals("seek") && str2 != null && (i17 = new org.json.JSONObject(str2).getInt("progress")) >= 0) {
                        ((xe3.p) service).Ai(i18, cVar, new xe3.k(i17, cVar), "seek failed");
                        return;
                    }
                    return;
                case 106440182:
                    if (str.equals("pause")) {
                        ((xe3.p) service).Ai(i18, cVar, new xe3.g(cVar), "pausePlay failed");
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // xd3.d
    public void f(ve3.u action, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16467x9eb59478 data, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        android.os.Parcelable parcelable = data.f229699h;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = parcelable instanceof com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d ? (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) parcelable : null;
        java.lang.String str = c10756x2a5d7b2d != null ? c10756x2a5d7b2d.f149939d : null;
        if (str == null) {
            e(rVar, -1, "action invalid");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MB_External_surface_action", "OperateHandler Invalid action payload");
            return;
        }
        if (!(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "startPlay") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "stopPlay") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "resume") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "mute") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "loop") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "seek") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "pause"))) {
            e(rVar, -1, "action invalid Unsupported operation: ".concat(str));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MB_External_surface_action", "OperateHandler Unsupported operation: ".concat(str));
            return;
        }
        if ((p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "mute") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "loop") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "seek")) && data.f229698g == null) {
            e(rVar, -1, "no extraData");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MB_External_surface_action", "OperateHandler no extraData");
        }
    }
}
