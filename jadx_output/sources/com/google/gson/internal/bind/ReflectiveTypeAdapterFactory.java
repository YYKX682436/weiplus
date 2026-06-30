package com.google.gson.internal.bind;

/* loaded from: classes16.dex */
public final class ReflectiveTypeAdapterFactory implements com.google.gson.w {

    /* renamed from: d, reason: collision with root package name */
    public final com.google.gson.internal.r f44727d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.gson.h f44728e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.gson.internal.Excluder f44729f;

    /* renamed from: g, reason: collision with root package name */
    public final com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory f44730g;

    /* renamed from: h, reason: collision with root package name */
    public final hb.b f44731h = hb.b.f280008a;

    /* loaded from: classes16.dex */
    public static final class Adapter<T> extends com.google.gson.v {

        /* renamed from: a, reason: collision with root package name */
        public final com.google.gson.internal.d0 f44732a;

        /* renamed from: b, reason: collision with root package name */
        public final java.util.Map f44733b;

        public Adapter(com.google.gson.internal.d0 d0Var, java.util.Map map) {
            this.f44732a = d0Var;
            this.f44733b = map;
        }

        @Override // com.google.gson.v
        public java.lang.Object b(jb.b bVar) {
            if (bVar.K() == jb.c.NULL) {
                bVar.D();
                return null;
            }
            java.lang.Object a17 = this.f44732a.a();
            try {
                bVar.b();
                while (bVar.l()) {
                    com.google.gson.internal.bind.d dVar = (com.google.gson.internal.bind.d) this.f44733b.get(bVar.A());
                    if (dVar != null && dVar.f44770c) {
                        com.google.gson.internal.bind.c cVar = (com.google.gson.internal.bind.c) dVar;
                        java.lang.Object b17 = cVar.f44764f.b(bVar);
                        if (b17 != null || !cVar.f44767i) {
                            cVar.f44762d.set(a17, b17);
                        }
                    }
                    bVar.Q();
                }
                bVar.j();
                return a17;
            } catch (java.lang.IllegalAccessException e17) {
                throw new java.lang.AssertionError(e17);
            } catch (java.lang.IllegalStateException e18) {
                throw new com.google.gson.r(e18);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        
            r7.k(r1.f44768a);
            r1 = (com.google.gson.internal.bind.c) r1;
            r2 = r1.f44762d.get(r8);
            r3 = r1.f44763e;
            r4 = r1.f44764f;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        
            if (r3 == false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
        
            r4.c(r7, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
        
            r4 = new com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper(r1.f44765g, r4, r1.f44766h.f290022b);
         */
        @Override // com.google.gson.v
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void c(jb.d r7, java.lang.Object r8) {
            /*
                r6 = this;
                if (r8 != 0) goto L6
                r7.p()
                return
            L6:
                r7.c()
                java.util.Map r0 = r6.f44733b     // Catch: java.lang.IllegalAccessException -> L5b
                java.util.Collection r0 = r0.values()     // Catch: java.lang.IllegalAccessException -> L5b
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.IllegalAccessException -> L5b
            L13:
                boolean r1 = r0.hasNext()     // Catch: java.lang.IllegalAccessException -> L5b
                if (r1 == 0) goto L57
                java.lang.Object r1 = r0.next()     // Catch: java.lang.IllegalAccessException -> L5b
                com.google.gson.internal.bind.d r1 = (com.google.gson.internal.bind.d) r1     // Catch: java.lang.IllegalAccessException -> L5b
                r2 = r1
                com.google.gson.internal.bind.c r2 = (com.google.gson.internal.bind.c) r2     // Catch: java.lang.IllegalAccessException -> L5b
                boolean r3 = r2.f44769b     // Catch: java.lang.IllegalAccessException -> L5b
                r4 = 0
                if (r3 != 0) goto L28
                goto L31
            L28:
                java.lang.reflect.Field r2 = r2.f44762d     // Catch: java.lang.IllegalAccessException -> L5b
                java.lang.Object r2 = r2.get(r8)     // Catch: java.lang.IllegalAccessException -> L5b
                if (r2 == r8) goto L31
                r4 = 1
            L31:
                if (r4 == 0) goto L13
                java.lang.String r2 = r1.f44768a     // Catch: java.lang.IllegalAccessException -> L5b
                r7.k(r2)     // Catch: java.lang.IllegalAccessException -> L5b
                com.google.gson.internal.bind.c r1 = (com.google.gson.internal.bind.c) r1     // Catch: java.lang.IllegalAccessException -> L5b
                java.lang.reflect.Field r2 = r1.f44762d     // Catch: java.lang.IllegalAccessException -> L5b
                java.lang.Object r2 = r2.get(r8)     // Catch: java.lang.IllegalAccessException -> L5b
                boolean r3 = r1.f44763e     // Catch: java.lang.IllegalAccessException -> L5b
                com.google.gson.v r4 = r1.f44764f     // Catch: java.lang.IllegalAccessException -> L5b
                if (r3 == 0) goto L47
                goto L53
            L47:
                com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper r3 = new com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper     // Catch: java.lang.IllegalAccessException -> L5b
                ib.a r5 = r1.f44766h     // Catch: java.lang.IllegalAccessException -> L5b
                java.lang.reflect.Type r5 = r5.f290022b     // Catch: java.lang.IllegalAccessException -> L5b
                com.google.gson.i r1 = r1.f44765g     // Catch: java.lang.IllegalAccessException -> L5b
                r3.<init>(r1, r4, r5)     // Catch: java.lang.IllegalAccessException -> L5b
                r4 = r3
            L53:
                r4.c(r7, r2)     // Catch: java.lang.IllegalAccessException -> L5b
                goto L13
            L57:
                r7.j()
                return
            L5b:
                r7 = move-exception
                java.lang.AssertionError r8 = new java.lang.AssertionError
                r8.<init>(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter.c(jb.d, java.lang.Object):void");
        }
    }

    public ReflectiveTypeAdapterFactory(com.google.gson.internal.r rVar, com.google.gson.h hVar, com.google.gson.internal.Excluder excluder, com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.f44727d = rVar;
        this.f44728e = hVar;
        this.f44729f = excluder;
        this.f44730g = jsonAdapterAnnotationTypeAdapterFactory;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:35)
        */
    @Override // com.google.gson.w
    public com.google.gson.v a(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r35v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:80)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:400)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:388)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:338)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (r0 == false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(java.lang.reflect.Field r10, boolean r11) {
        /*
            r9 = this;
            java.lang.Class r0 = r10.getType()
            com.google.gson.internal.Excluder r1 = r9.f44729f
            boolean r2 = r1.b(r0)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L13
            r1.c(r0, r11)
            r0 = r3
            goto L14
        L13:
            r0 = r4
        L14:
            if (r0 != 0) goto Lac
            int r0 = r10.getModifiers()
            int r2 = r1.f44687e
            r0 = r0 & r2
            if (r0 == 0) goto L21
            goto L85
        L21:
            double r5 = r1.f44686d
            r7 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L40
            java.lang.Class<fb.c> r0 = fb.c.class
            java.lang.annotation.Annotation r0 = r10.getAnnotation(r0)
            fb.c r0 = (fb.c) r0
            java.lang.Class<fb.d> r2 = fb.d.class
            java.lang.annotation.Annotation r2 = r10.getAnnotation(r2)
            fb.d r2 = (fb.d) r2
            boolean r0 = r1.d(r0, r2)
            if (r0 != 0) goto L40
            goto L85
        L40:
            boolean r0 = r10.isSynthetic()
            if (r0 == 0) goto L47
            goto L85
        L47:
            boolean r0 = r1.f44688f
            if (r0 != 0) goto L68
            java.lang.Class r0 = r10.getType()
            boolean r2 = r0.isMemberClass()
            if (r2 == 0) goto L64
            int r0 = r0.getModifiers()
            r0 = r0 & 8
            if (r0 == 0) goto L5f
            r0 = r4
            goto L60
        L5f:
            r0 = r3
        L60:
            if (r0 != 0) goto L64
            r0 = r4
            goto L65
        L64:
            r0 = r3
        L65:
            if (r0 == 0) goto L68
            goto L85
        L68:
            java.lang.Class r10 = r10.getType()
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            boolean r0 = r0.isAssignableFrom(r10)
            if (r0 != 0) goto L82
            boolean r0 = r10.isAnonymousClass()
            if (r0 != 0) goto L80
            boolean r10 = r10.isLocalClass()
            if (r10 == 0) goto L82
        L80:
            r10 = r4
            goto L83
        L82:
            r10 = r3
        L83:
            if (r10 == 0) goto L87
        L85:
            r10 = r4
            goto La9
        L87:
            if (r11 == 0) goto L8c
            java.util.List r10 = r1.f44689g
            goto L8e
        L8c:
            java.util.List r10 = r1.f44690h
        L8e:
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto La8
            java.util.Iterator r10 = r10.iterator()
            boolean r11 = r10.hasNext()
            if (r11 != 0) goto L9f
            goto La8
        L9f:
            java.lang.Object r10 = r10.next()
            android.support.v4.media.f.a(r10)
            r10 = 0
            throw r10
        La8:
            r10 = r3
        La9:
            if (r10 != 0) goto Lac
            r3 = r4
        Lac:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b(java.lang.reflect.Field, boolean):boolean");
    }
}
