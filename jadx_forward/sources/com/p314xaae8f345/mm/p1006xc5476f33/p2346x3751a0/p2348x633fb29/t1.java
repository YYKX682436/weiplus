package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes.dex */
public final class t1 {
    public t1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a() {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoipModelUdrMgr", "Directories creation results: " + kz5.b0.c(java.lang.Boolean.valueOf(com.p314xaae8f345.mm.vfs.w6.u(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.u1.f258340e))));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("VoipModelUdrMgr", e17, "Failed to create directories", new java.lang.Object[0]);
        }
    }

    public final java.lang.String b(java.lang.String basename) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basename, "basename");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(basename, c("rnnoise_16k.bin"))) {
            return "rnnoise_16k.bin";
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(basename, c("rnnoise_48k.bin"))) {
            return "rnnoise_48k.bin";
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(basename, c("cldnn_ns_16k.bin"))) {
            return "cldnn_ns_16k.bin";
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(basename, c("cldnn_ns_48k.bin"))) {
            return "cldnn_ns_48k.bin";
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(basename, c("channels_ns_16k.bin"))) {
            return "channels_ns_16k.bin";
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(basename, c("channels_ns_48k.bin"))) {
            return "channels_ns_48k.bin";
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(basename, c("fsnet_16k.bin"))) {
            return "fsnet_16k.bin";
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(basename, c("fsnet_48k.bin"))) {
            return "fsnet_48k.bin";
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(basename, c("rnnhowlsup_16k.bin"))) {
            return "rnnhowlsup_16k.bin";
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(basename, c("cldnnhowlsup_16k.bin"))) {
            return "cldnnhowlsup_16k.bin";
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(basename, c("cldnnhowlsup_48k.bin"))) {
            return "cldnnhowlsup_48k.bin";
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(basename, c("tfunet_aec_16k.xnet"))) {
            return "tfunet_aec_16k.xnet";
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(basename, c("cfn_ns_16k.xnet"))) {
            return "cfn_ns_16k.xnet";
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(basename, c("mcfusion_aec_16k.xnet"))) {
            return "mcfusion_aec_16k.xnet";
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(basename, c("mcfusion_aec_16k_asr.xnet"))) {
            return "mcfusion_aec_16k_asr.xnet";
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(basename, c("mcfusion_aec_32k.xnet"))) {
            return "mcfusion_aec_32k.xnet";
        }
        return null;
    }

    public final java.lang.String c(java.lang.String fullName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fullName, "fullName");
        return r26.n0.t0(fullName, '.', null, 2, null);
    }
}
