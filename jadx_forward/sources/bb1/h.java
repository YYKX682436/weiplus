package bb1;

/* loaded from: classes7.dex */
public final class h {
    public h(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final int a(java.lang.String type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        switch (type.hashCode()) {
            case -844996807:
                if (type.equals("uint32")) {
                    return com.p314xaae8f345.mm.p2818xd0d82df3.C22946x9dcab3c3.f39963x4fbc8495.m83560xae6cc4bc();
                }
                break;
            case -766443077:
                if (type.equals("float32")) {
                    return com.p314xaae8f345.mm.p2818xd0d82df3.C22946x9dcab3c3.f39963x4fbc8495.m83556x416e6078();
                }
                break;
            case 3237417:
                if (type.equals("int8")) {
                    return com.p314xaae8f345.mm.p2818xd0d82df3.C22946x9dcab3c3.f39963x4fbc8495.m83559x784dc88c();
                }
                break;
            case 100359822:
                if (type.equals("int32")) {
                    return com.p314xaae8f345.mm.p2818xd0d82df3.C22946x9dcab3c3.f39963x4fbc8495.m83557x916b488b();
                }
                break;
            case 100359917:
                if (type.equals("int64")) {
                    return com.p314xaae8f345.mm.p2818xd0d82df3.C22946x9dcab3c3.f39963x4fbc8495.m83558x916b48ea();
                }
                break;
            case 111289374:
                if (type.equals("uint8")) {
                    return com.p314xaae8f345.mm.p2818xd0d82df3.C22946x9dcab3c3.m83554x9203823b();
                }
                break;
        }
        throw new java.lang.RuntimeException("runInferenceSession unsupported data type from xnet output tensor");
    }

    public final java.lang.String b(int i17) {
        if (i17 == com.p314xaae8f345.mm.p2818xd0d82df3.C22946x9dcab3c3.m83554x9203823b()) {
            return "uint8";
        }
        com.p314xaae8f345.mm.p2818xd0d82df3.C22946x9dcab3c3 c22946x9dcab3c3 = com.p314xaae8f345.mm.p2818xd0d82df3.C22946x9dcab3c3.f39963x4fbc8495;
        if (i17 == c22946x9dcab3c3.m83559x784dc88c()) {
            return "int8";
        }
        if (i17 == c22946x9dcab3c3.m83560xae6cc4bc()) {
            return "uint32";
        }
        if (i17 == c22946x9dcab3c3.m83557x916b488b()) {
            return "int32";
        }
        if (i17 == c22946x9dcab3c3.m83556x416e6078()) {
            return "float32";
        }
        if (i17 == c22946x9dcab3c3.m83558x916b48ea()) {
            return "int64";
        }
        throw new java.lang.RuntimeException("runInferenceSession unsupported data type from xnet output tensor");
    }
}
