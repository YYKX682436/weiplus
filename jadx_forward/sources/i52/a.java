package i52;

/* loaded from: classes15.dex */
public final class a implements yj0.d {
    @Override // yj0.d
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object obj2) {
    }

    @Override // yj0.d
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object[] objArr) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "com/tencent/mm/ui/chatting/ChattingUIFragment") && str2 != null) {
            switch (str2.hashCode()) {
                case -1799985168:
                    if (str2.equals("onEnterBegin") && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "()V") && !i52.b.f370002b) {
                        synchronized (i52.b.f370001a) {
                            java.util.Iterator it = ((java.util.ArrayList) i52.b.f370005e).iterator();
                            while (it.hasNext()) {
                                i52.c cVar = (i52.c) ((i52.m) it.next());
                                cVar.getClass();
                                i52.d.a(cVar.f370008a, 1, java.lang.System.currentTimeMillis());
                            }
                        }
                        i52.b.f370003c = true;
                        return;
                    }
                    return;
                case -1427566836:
                    if (str2.equals("onExitBegin") && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "()V") && !i52.b.f370002b) {
                        synchronized (i52.b.f370001a) {
                            java.util.Iterator it6 = ((java.util.ArrayList) i52.b.f370005e).iterator();
                            while (it6.hasNext()) {
                                i52.c cVar2 = (i52.c) ((i52.m) it6.next());
                                cVar2.getClass();
                                i52.d.a(cVar2.f370008a, 4, java.lang.System.currentTimeMillis());
                            }
                        }
                        i52.b.f370004d = true;
                        return;
                    }
                    return;
                case -112389456:
                    if (str2.equals("doAttach") && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "(Landroid/content/Context;)V")) {
                        i52.b.f370002b = true;
                        return;
                    }
                    return;
                case 20863998:
                    if (str2.equals("onExitEnd") && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "()V")) {
                        i52.b.f370002b = false;
                        java.util.Iterator it7 = i52.b.f370006f.iterator();
                        while (it7.hasNext()) {
                            ((e42.j0) it7.next()).u(obj);
                        }
                        return;
                    }
                    return;
                case 360443032:
                    if (str2.equals("doResume") && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "()V") && !i52.b.f370002b) {
                        if (i52.b.f370003c) {
                            i52.b.f370003c = false;
                            return;
                        }
                        synchronized (i52.b.f370001a) {
                            java.util.Iterator it8 = ((java.util.ArrayList) i52.b.f370005e).iterator();
                            while (it8.hasNext()) {
                                i52.c cVar3 = (i52.c) ((i52.m) it8.next());
                                cVar3.getClass();
                                i52.d.a(cVar3.f370008a, 2, java.lang.System.currentTimeMillis());
                            }
                        }
                        return;
                    }
                    return;
                case 1810778155:
                    if (str2.equals("doPause") && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "()V") && !i52.b.f370002b) {
                        if (i52.b.f370004d) {
                            i52.b.f370004d = false;
                            return;
                        }
                        synchronized (i52.b.f370001a) {
                            java.util.Iterator it9 = ((java.util.ArrayList) i52.b.f370005e).iterator();
                            while (it9.hasNext()) {
                                i52.c cVar4 = (i52.c) ((i52.m) it9.next());
                                cVar4.getClass();
                                i52.d.a(cVar4.f370008a, 3, java.lang.System.currentTimeMillis());
                            }
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
