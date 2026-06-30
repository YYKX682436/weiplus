package jh4;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f381384b;

    /* renamed from: a, reason: collision with root package name */
    public static final jh4.d f381383a = new jh4.d();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.List f381385c = kz5.c0.i("scene_shaderf.glsl", "scene_shaderv.glsl", "frag_framebuffer_plane.glsl", "vertex_framebuffer_plane.glsl", "texture_vertex_shader.glsl", "texture_fragment_shader.glsl", "bg_gradient_vertex_shader.glsl", "bg_gradient_fragment_shader.glsl");

    public final void a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        mq.h.f412044a = jh4.f.f381390a;
        if (b(context)) {
            f381384b = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DynamicBackgroundManager", "all exist, return");
            return;
        }
        mq.e eVar = mq.e.f412043a;
        java.io.File file = new java.io.File(eVar.b(context));
        if (!file.exists()) {
            file.mkdirs();
        }
        eVar.a(context, "scene_shaderf.glsl", eVar.b(context) + "scene_shaderf.glsl");
        eVar.a(context, "scene_shaderv.glsl", eVar.b(context) + "scene_shaderv.glsl");
        eVar.a(context, "frag_framebuffer_plane.glsl", eVar.b(context) + "frag_framebuffer_plane.glsl");
        eVar.a(context, "vertex_framebuffer_plane.glsl", eVar.b(context) + "vertex_framebuffer_plane.glsl");
        eVar.a(context, "texture_vertex_shader.glsl", eVar.b(context) + "texture_vertex_shader.glsl");
        eVar.a(context, "texture_fragment_shader.glsl", eVar.b(context) + "texture_fragment_shader.glsl");
        eVar.a(context, "bg_gradient_vertex_shader.glsl", eVar.b(context) + "bg_gradient_vertex_shader.glsl");
        eVar.a(context, "bg_gradient_fragment_shader.glsl", eVar.b(context) + "bg_gradient_fragment_shader.glsl");
        f381384b = b(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DynamicBackgroundManager", "init done, ready[" + f381384b + ']');
    }

    public final boolean b(android.content.Context context) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String parent = context.getFilesDir().getParent();
        if (parent == null || (str = parent.concat("/")) == null) {
            str = "";
        }
        java.lang.String concat = str.concat("appbrand/glsl/");
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(concat);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DynamicBackgroundManager", "dir not exist");
            return false;
        }
        for (java.lang.String str3 : f381385c) {
            com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(concat + str3);
            java.lang.String str4 = a18.f294812f;
            if (str4 != null) {
                java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
                if (!str4.equals(l18)) {
                    a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
            if (!(!m18.a() ? false : m18.f294799a.F(m18.f294800b))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DynamicBackgroundManager", str3 + " not exist");
                return false;
            }
        }
        return true;
    }
}
