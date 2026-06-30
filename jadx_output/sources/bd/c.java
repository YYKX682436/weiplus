package bd;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: classes15.dex */
public @interface c {
    boolean isReturnBuffer() default false;

    java.lang.Class returnType() default bd.k.class;

    boolean uiThread() default true;
}
