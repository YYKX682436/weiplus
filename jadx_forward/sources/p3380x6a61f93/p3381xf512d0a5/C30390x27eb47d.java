package p3380x6a61f93.p3381xf512d0a5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ4\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0007¨\u0006\r"}, d2 = {"Lurgen/ur_0025/URS_B9FC;", "", "Lcom/tencent/unit_rc/BaseObjectDef;", "buffer", "callback", "", "sampleRate", "audioFormat", "channels", "Ljz5/f0;", "UR_F96B", "<init>", "()V", "plugin-ting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: urgen.ur_0025.URS_B9FC */
/* loaded from: classes15.dex */
public final class C30390x27eb47d {

    /* renamed from: INSTANCE */
    public static final p3380x6a61f93.p3381xf512d0a5.C30390x27eb47d f76987x4fbc8495 = new p3380x6a61f93.p3381xf512d0a5.C30390x27eb47d();

    private C30390x27eb47d() {
    }

    /* renamed from: UR_F96B */
    public static final void m168505x21ba7721(com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 interfaceC26826xca759055, com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 interfaceC26826xca7590552, int i17, int i18, int i19) {
        jm4.p1 p1Var;
        jm4.w1 w1Var = jm4.x1.f381973r;
        jm4.k1 k1Var = (jm4.k1) interfaceC26826xca7590552;
        if (k1Var == null) {
            p1Var = null;
        } else {
            if (k1Var instanceof jm4.x1) {
            }
            p1Var = new jm4.p1(k1Var);
        }
        jm4.u0 u0Var = (jm4.u0) interfaceC26826xca759055;
        sk4.p pVar = (sk4.p) jm4.x0.a();
        if (i17 != pVar.f490522d || i19 != pVar.f490523e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AudioRecorderImpl", "sampleRate or channelCnt mismatched");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(u0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.ting.audiochat.AudioRecorderBufferImpl");
        com.p314xaae8f345.p3118xeeebfacc.C26831x7765d788 c26831x7765d788 = ((sk4.c) u0Var).f490502g;
        if (c26831x7765d788 == null || p1Var == null) {
            return;
        }
        p1Var.mo146xb9724478(c26831x7765d788);
    }
}
